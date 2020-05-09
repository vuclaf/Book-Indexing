import java.util.*;
import java.io.*;
/**
 * An index using HashMap
 *
 * @author EvanVu
 */
public class HashIndex implements Index
{
   HashMap<String, TreeSet<Integer>> map = new HashMap<String, TreeSet<Integer>>();
   ArrayList<String> dict = new ArrayList();
   PrintWriter writer = null;
   int rejCount=0;
   
   /**
    * Constructor for the HashIndex class
    */
   public HashIndex() throws IOException{
        Scanner sc = new Scanner(new File("English.txt"));
        while(sc.hasNext()){
            dict.add(sc.nextLine());
        }
        writer = new PrintWriter(new File("outputhash.txt"));
   }
   
   /**
    * Process the text by line
    * @param array of string as text and number of current line
    *
    */
   public void processText(String[] text, int lineNum){
       for (String word:text){
           if (this.checkDict(word)){
               TreeSet<Integer> set = map.getOrDefault(word, new TreeSet<Integer>());
               set.add(lineNum);
               map.put(word,set);
           }
           else rejCount++;
       }
   }
   
   /**
    * Write to output file all the entries of the index
    */
   public void printIndex(){
       Map<String,TreeSet<Integer>> treemap = new TreeMap<String,TreeSet<Integer>>(map);
       for (String word:treemap.keySet()){
           writer.println(word+ " "+treemap.get(word));
       }
       writer.close();
   }
   
   /**
     * Method to check if the word is in the dictionary
     * @param the word to be searched
     * @return true if the word is in the English dictionary
     */
    public boolean checkDict(String word){
        int res = Collections.binarySearch(dict,word);
        if (res>0) return true;
        return false;
    }
    
    /**
     * Printing method used for testing
     * @param the word to be inspected
     * @return String as output written to file
     */
    public String printTest(String word){
        Map<String, TreeSet<Integer>> treemap = new TreeMap<String, TreeSet<Integer>>(map);
        return word + " " + treemap.get(word);
    }
}

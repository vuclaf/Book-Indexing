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
   
   public HashIndex() throws IOException{
        Scanner sc = new Scanner(new File("English.txt"));
        sc.nextLine();
        while(sc.hasNext()){
            dict.add(sc.nextLine());
        }
   }
   
   public void processText(String[] text, int lineNum){
       for (String word:text){
           if (this.checkDict(word)){
               TreeSet<Integer> set = map.getOrDefault(word, new TreeSet<Integer>());
               set.add(lineNum);
               map.put(word,set);
            }
       }
   }
   
   public void printIndex(){
       Map<String,TreeSet<Integer>> treemap = new TreeMap<String,TreeSet<Integer>>(map);
       for (String word:treemap.keySet()){
           String lines="";
           Iterator itr = treemap.get(word).iterator();
           while(itr.hasNext()){
               lines+=itr.next();
               if (itr.hasNext()) lines+=", ";
           }
           System.out.println(word + " [" + lines + "]");
       }
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
}

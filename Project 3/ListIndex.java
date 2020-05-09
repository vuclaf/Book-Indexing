import java.util.*;
import java.io.*;
/**
 * Index implemented by a list
 *
 * @author EvanVu
 */
public class ListIndex implements Index
{
    List<Entry> list = new ArrayList();
    ArrayList<String> dict = new ArrayList();
    PrintWriter writer = null;
    int rejCount=0;
    
    public ListIndex()throws IOException{
        Scanner sc = new Scanner(new File("English.txt"));
        while(sc.hasNext()){
            dict.add(sc.nextLine());
        }
        writer = new PrintWriter(new File("output.txt"));
    }
    
    /**
     * Receive text from an input file and put them into the index
     * @param an array of text
     */
    public void processText(String[] text, int lineNum){
        for (String word:text){
           int checker=this.checkEntry(word);
           if(this.checkDict(word)){
               if(list.isEmpty()){
                   list.add(new Entry(word));
                   list.get(0).addEntry(lineNum);
               }
               else if(checker<0){
                   list.add(-checker-1,new Entry(word));
                   list.get(-checker-1).addEntry(lineNum);
               }
               else list.get(checker).addEntry(lineNum);
           }
           else rejCount++;
       }
    }
    
    /**
     * Print to the terminal the index
     */
    public void printIndex(){
        Collections.sort(list);
        for(Entry entry:list){
            writer.println(entry.word + " " + entry.set);
            //System.out.println(entry.printAll());
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
        else return false;
    }
    
    /**
     * Method to check if the word is already in the list
     * @param the word to be searched
     * @return the pos of the word is in the list
     */
    public int checkEntry(String word){
        Entry ent= new Entry(word);
        return Collections.binarySearch(list,ent);
    }
    
    /**
     * Printing method used for testing
     * @param a line in the index to be inspected
     * @return String as output written to file
     */
    public String printTest(int wordNum){
        Collections.sort(list);
        return list.get(wordNum).word+" "+list.get(wordNum).set;
    }
}

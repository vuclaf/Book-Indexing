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
    
    public ListIndex()throws IOException{
        Scanner sc = new Scanner(new File("English.txt"));
        sc.nextLine();
        while(sc.hasNext()){
            dict.add(sc.nextLine());
        }
    }
    
    /**
     * Receive text from an input file and put them into the index
     * @param an array of text
     */
    public void processText(String[] text, int lineNum){
        for (String word:text){
           int checker=this.checkEntry(word);
           if(this.checkDict(word)){
               if(checker==-1){
                   list.add(new Entry(word));
                   list.get(list.size()-1).addEntry(lineNum);
               }
               else list.get(checker).addEntry(lineNum);
           }
       }
    }
    
    /**
     * Print to the terminal the index
     */
    public void printIndex(){
        for(Entry entry:list){
            System.out.println(entry.printAll());
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
        else return false;
    }
    
    /**
     * Method to check if the word is already in the list
     * @param the word to be searched
     * @return true if the word is in the list
     */
    public int checkEntry(String word){
        if (list.isEmpty()) return -1;
        for(Entry entry:list){
            if (entry.word.equals(word)) return list.indexOf(entry);
        }
        return -1;
    }
}

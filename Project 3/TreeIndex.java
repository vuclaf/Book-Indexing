import java.util.*;
/**
 * An index using TreeMap
 *
 * @author EvanVu
 */
public class TreeIndex implements Index
{
   TreeMap<String, TreeSet<Integer>> map = new TreeMap<String, TreeSet<Integer>>();
   
   public TreeIndex(){}
   
   public void processText(String[] text, int lineNum){
       for (String word:text){
           TreeSet<Integer> set = map.getOrDefault(word, new TreeSet<Integer>());
           set.add(lineNum);
           map.put(word,set);
       }
   }
   
   public void printIndex(){
       for (String word:map.keySet()){
           String lines="";
           for (Integer line:map.get(word)){
               lines+= line + ",";
           }
           System.out.println("The word " + word + " appears on lines: " + lines);
        }
   }
}

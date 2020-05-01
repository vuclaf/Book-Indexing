import java.util.*;
/**
 * An index using HashMap
 *
 * @author EvanVu
 */
public class HashIndex implements Index
{
   HashMap<String, HashSet<Integer>> map = new HashMap<String, HashSet<Integer>>();
   
   public HashIndex(){}
   
   public void processText(String[] text, int lineNum){
       for (String word:text){
           HashSet<Integer> set = map.getOrDefault(word, new HashSet<Integer>());
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

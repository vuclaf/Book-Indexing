import java.util.*;
import java.io.*;
/**
 * The Main class to create an index
 *
 * @author EvanVu
 */
public class Main{
    public static void main(String[] args) throws IOException{
        TreeIndex tree = new TreeIndex();
        HashIndex hash = new HashIndex();
        ListIndex list = new ListIndex();
        Scanner sc = new Scanner(new File("Shakespeare.txt"));
        int lineNum=0;
        while(sc.hasNext()){
            lineNum++;
            String newLine = sc.nextLine().toLowerCase();
            String[] newWords = newLine.split("[^A-Za-z]+");
            tree.processText(newWords,lineNum);
            //hash.processText(newWords,lineNum);
            //list.processText(newWords,lineNum);
        }
        tree.printIndex();
    }
}

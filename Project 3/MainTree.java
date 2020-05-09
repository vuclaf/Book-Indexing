import java.util.*;
import java.io.*;
/**
 * The Main class to create an index
 *
 * @author EvanVu
 */
public class MainTree{
    public static void main(String[] args) throws IOException{
        MainTree m = new MainTree();
        for(int i=1;i<17;i++) m.Run(i);
    }
    
    public MainTree(){}
    public static void Run(int num) throws IOException{
        TreeIndex tree = new TreeIndex();
        long time1=0;
        long time2=0;
        long time3=0;
        long time4=0;
        long total1=0;
        long total2=0;
        long total3=0;
        int wordCount=0;
        Scanner sc = new Scanner(new File("Books/"+num+".txt"));
        int lineNum=0;
        while(sc.hasNext()){
            lineNum++;
            String newLine = sc.nextLine().toLowerCase();
            String[] newWords = newLine.split("[^A-Za-z]+");
            wordCount+=newWords.length;
            time1 = System.currentTimeMillis();
            tree.processText(newWords,lineNum);
            time2 = System.currentTimeMillis();
            total1+=time2-time1;
        }
        //System.out.println("Time for" + tree.map.size() + " tree insertion: " + total1);
        //System.out.println(total1);
        time3 = System.currentTimeMillis();
        tree.printIndex();
        time4 = System.currentTimeMillis();
        total1=time4-time3;
        //System.out.println("Time for" + tree.map.size() + " tree retrieval: " + total2);
        //System.out.println(total1);
        System.out.println(tree.rejCount);
    }
}

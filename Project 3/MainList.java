import java.util.*;
import java.io.*;
/**
 * The Main class to create an index
 *
 * @author EvanVu
 */
public class MainList{
    public static void main(String[] args) throws IOException{
        MainList m = new MainList();
        for(int i=1;i<17;i++) m.Run(i);
    }
    
    public MainList(){}
    public static void Run(int num) throws IOException{
        ListIndex list = new ListIndex();
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
            time3 = System.currentTimeMillis();
            list.processText(newWords,lineNum);
            time4 = System.currentTimeMillis();
            total3+=time4-time3;
        }
        //System.out.println("Time for" + list.list.size() + " list insertion: " + total3);
        //System.out.println(total3);
        time1 = System.currentTimeMillis();
        list.printIndex();
        time2 = System.currentTimeMillis();
        total3=time2-time1;
        //System.out.println("Time for" + list.list.size() + " list retrieval: " + total3);
        //System.out.println(total3);
        System.out.println(list.rejCount);
    }
}

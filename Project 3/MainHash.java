import java.util.*;
import java.io.*;
/**
 * The Main class to create an index
 *
 * @author EvanVu
 */
public class MainHash{
    public static void main(String[] args) throws IOException{
        MainHash m = new MainHash();
        for(int i=1;i<17;i++) m.Run(i);
    }
    
    public MainHash(){}
        
    public void Run(int num)throws IOException{
        HashIndex hash = new HashIndex();
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
            time2 = System.currentTimeMillis();
            hash.processText(newWords,lineNum);
            time3 = System.currentTimeMillis();
            total2+=time3-time2;
        }
        //System.out.println("Time for" + wordCount + " hash insertion: " + total2);
        //System.out.println(total2);
        time2 = System.currentTimeMillis();
        hash.printIndex();
        time3 = System.currentTimeMillis();
        total2=time3-time2;
        //System.out.println("Time for" + wordCount + " hash retrieval: " + total2);
        //System.out.println(total2);
        System.out.println(hash.rejCount);
    }
}

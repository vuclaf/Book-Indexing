import java.util.*;
/**
 * List entry to be on the ListIndex
 *
 * @author EvanVu
 */
public class Entry
{
    String word;
    TreeSet<Integer> set = new TreeSet<Integer>();
    
    /**
     * Constructor for objects of class Entry
     * @param the word of the entry
     */
    public Entry(String word)
    {
        this.word=word;
    }

    /**
     * Add to the list of entries
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addEntry(int lineNum)
    {
        set.add(lineNum);
    }
    
    /**
     * Return all entries for a given word
     *
     * @return  the string listing all the entries
     */
    public String printAll()
    {
        String result=word + " [";
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            result+= itr.next();
            if(itr.hasNext()) result+=", ";
        }
        result+="]";
        return result;
    }
}

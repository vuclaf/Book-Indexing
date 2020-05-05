import java.util.*;
/**
 * Interface for the indexes
 *
 * @author EvanVu
 */
public interface Index
{
    /**
     * Receive text from an input file and put them into the index
     * @param an array of text
     */
    void processText(String[] text, int lineNum);
    
    /**
     * Print to the terminal the index
     */
    void printIndex();
    
    /**
     * Method to check if the word is in the dictionary
     * @param the word to be searched
     * @return true if the word is in the English dictionary
     */
    boolean checkDict(String word);
}

import java.io.*;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class HashIndexTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HashIndexTest
{
    /**
     * Default constructor for test class HashIndexTest
     */
    public HashIndexTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
        @Test
    public void addWord() throws IOException
    {
        ListIndex listIndex = new ListIndex();
        listIndex.processText(new String[]{"Fox","is","cute","animal"}, 5);
        listIndex.processText(new String[]{"fox"}, 2);
        listIndex.processText(new String[]{"is","animal"}, 3);
        String result = "animal [3, 5]";
        assertTrue(result.equals(listIndex.printTest(0)));
    }
    
    @Test
    public void checkDict() throws IOException
    {
        ListIndex listIndex = new ListIndex();
        assertTrue(listIndex.checkDict("king"));
        assertFalse(listIndex.checkDict("skrrrt"));
    }
    
    @Test
    public void checkEntry() throws IOException
    {
        ListIndex listIndex = new ListIndex();
        listIndex.processText(new String[]{"Fox","is","cute","animal"}, 5);
        listIndex.processText(new String[]{"fox"}, 2);
        listIndex.processText(new String[]{"is","animal"}, 3);
        assertTrue(listIndex.checkEntry("fox")>0);
        assertFalse(listIndex.checkEntry("cat")>0);
    }
}

import java.io.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ListIndexTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ListIndexTest
{
    /**
     * Default constructor for test class ListIndexTest
     */
    public ListIndexTest()
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
        listIndex.printIndex();
    }
}


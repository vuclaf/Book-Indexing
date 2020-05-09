import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class EntryTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EntryTest
{
    /**
     * Default constructor for test class EntryTest
     */
    public EntryTest()
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
    public void addTest()
    {
        Entry entry1 = new Entry("dog");
        entry1.addEntry(3);
        entry1.addEntry(56);
        entry1.addEntry(66);
        assertEquals("dog [3, 56, 66]", entry1.printAll());
    }

    @Test
    public void addTestDuplicate()
    {
        Entry entry1 = new Entry("dog");
        entry1.addEntry(3);
        entry1.addEntry(56);
        entry1.addEntry(66);
        entry1.addEntry(66);
        assertEquals("dog [3, 56, 66]", entry1.printAll());
    }
}



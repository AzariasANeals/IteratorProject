

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;
/**
 * The test class TestHashMapTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestHashMapTest
{
    TestHashMap tester;
    
    
    /**
     * Default constructor for test class TestHashMapTest
     */
    public TestHashMapTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        tester = new TestHashMap();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    // 3 Normal Test Cases
    @Test
    public void testGetHashMap(){
        int expected = TestHashMap.TOTAL_CATEGORIES;
        tester.insertCategories();
        int actual = tester.getHashMap().size();
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testInsertCategories(){
        int expected = TestHashMap.TOTAL_CATEGORIES;
        tester.insertCategories();
        int actual = tester.getNumberOfEntries();
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testKeyFound(){
        boolean expected = true;
        tester.insertCategories();
        boolean actual = tester.keyFound(TestHashMap.category1);
        
        assertEquals(expected, actual);
    }
    // 3 Edge Test Cases
    @Test
    public void testKeyNotFound(){
        boolean expected = false;
        tester.insertCategories();
        boolean actual = tester.keyFound("Paintings");
        assertEquals(expected, actual);
    }
    @Test
    public void testReturnValueNotExist(){
        int expected = TestHashMap.NOT_FOUND;
        tester.insertCategories();
        int actual = tester.returnValue("Paintings");
        assertEquals(expected, actual);
    }
    @Test
    public void testGetEmptyHashMap(){
        int expected = 0;
        int actual = tester.getHashMap().size();
        
        assertEquals(expected, actual);
    }
}

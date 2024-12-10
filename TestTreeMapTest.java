

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TestTreeMapTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestTreeMapTest
{
    TestTreeMap tester;
    
    /**
     * Default constructor for test class TestTreeMapTest
     */
    public TestTreeMapTest()
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
        tester = new TestTreeMap();
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
    public void testGetLowTemp(){
        double expected = TestTreeMap.LOW_TEMP;
        tester.insertData();
        double actual = tester.getLowTemp();
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetHighTemp(){
        double expected = TestTreeMap.HIGH_TEMP;
        tester.insertData();
        double actual = tester.getHighTemp();
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetHighTempMonth(){
        String expected = TestTreeMap.HIGH_TEMP_MONTH;
        tester.insertData();
        String actual = tester.getHighTempMonth();
        
        assertEquals(expected, actual);
    }
    
    // 3 Edge Test Cases
    @Test
    public void testEmptyGetLowTemp(){
        double expected = TestTreeMap.INVALID_LOW_TEMP;
        double actual = tester.getLowTemp();
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEmptyGetHighTemp(){
        double expected = TestTreeMap.INVALID_HIGH_TEMP;
        double actual = tester.getHighTemp();
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEmptyGetHighTempMonth(){
        String expected = TestTreeMap.MONTH_NOT_FOUND;
        String actual = tester.getHighTempMonth();
        
        assertEquals(expected, actual);
    }
}

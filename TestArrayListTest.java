

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

/**
 * The test class TestArrayListTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestArrayListTest
{
    TestArrayList tal;
    ArrayList<Integer> baseline;
    int baselineSum;
    
    
    /**
     * Default constructor for test class TestArrayListTest
     */
    public TestArrayListTest()
    {
        baseline = new ArrayList<Integer>();
        baselineSum = 227;
        baseline.add(12);
        baseline.add(45);
        baseline.add(33);
        baseline.add(48);
        baseline.add(89);
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        tal = new TestArrayList();
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
    
    //3 Normal Test Cases
    @Test
    public void testInsertNumbersRandom(){
        int expected = TestArrayList.numberOfIntegers;
        tal.insertNumbers();
        int actual = tal.getListOfNumbers().size();
        assertEquals(expected, actual);
    }
    @Test
    public void testInsertNumbersFixed(){
        int expected = 5;
        tal.insertNumbers(baseline);
        int actual = tal.getListOfNumbers().size();
        assertEquals(expected, actual);
    }
    @Test
    public void testGetSumOfList(){
        int expected = baselineSum;
        tal.insertNumbers(baseline);
        int actual = tal.getSumOfList();
        assertEquals(expected, actual);
    }
    
    // 3 Edge Case Tests
    @Test
    public void testEmptyArrayList(){
        int expected = 0;
        int actual = tal.getSumOfList();
        assertEquals(expected, actual);
    }
    @Test
    public void testEmptyGetListOfNumbers(){
        int expected = 0;
        int actual = tal.getListOfNumbers().size();
        assertEquals(expected, actual);
    }
    @Test
    public void testPrintEmptyList(){
        String expected = "";
        String actual = tal.printList();
        assertEquals(expected, actual);
    }
}

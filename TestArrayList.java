import java.util.*;
import java.lang.Math;
/**
 * This is my ArrayList class. Here we create an ArrayList of integers and populate it
 * with 10 random integers. We then use an iterator to traverse this list and to print out each
 * integer. Then we calculate the sum of these integers and print that out as well.
 * 
 * Finally we will add a new value to the list using the add() and print it out, then we will
 * remove the newly added value with remove() and print that out.
 * 
 */
public class TestArrayList
{
    private ArrayList<Integer> tester;

    public static final int multiplier = 100;
    public static final int numberOfIntegers = 10;
    public TestArrayList()
    {
        tester = new ArrayList<Integer>();

    }

    public void insertNumbers(){
        /*This for loop insert 10 unique random integers into an ArrayList */
        int buff = 0;
        for(int i = 0; i < numberOfIntegers; i++){
            buff = (int)(Math.random() * multiplier);
            while(tester.contains(buff)){
                buff = (int)(Math.random() * multiplier);
            }
            tester.add(buff);
        }

    }
    
    // This is a unit test helper function.
    public void insertNumbers(ArrayList<Integer> i){
        tester = i;
    }

    public ArrayList<Integer> getListOfNumbers(){
        return tester;
    }

    public int getSumOfList(){
        /*This uses an iterator to loop through the ArrayList and returns the sum total of the integers
        within the ArrayList. */
        int sum = 0;
        int buff = 0;
        Iterator<Integer> iterator = tester.iterator();
        while (iterator.hasNext()){
            buff = iterator.next();
            sum += buff;
            System.out.println(buff);
        }

        return sum;
    }

    // This run() exectutes the sample demo of the Iterators
    public void run(){
        int buff = 0;
        insertNumbers();
        System.out.println("This displays 10 random integer values and their sum totals");
        int sum = getSumOfList();
        System.out.println(" ");
        System.out.println("Sum Total: " + sum);
        System.out.println(" ");
        Iterator<Integer> iterator = tester.iterator();
        
        System.out.println("Demonstrating the creating of a new value and inserting it into the list");
        /*This creates a new unique value to be inserted into the ArrayList. */
        int newValue = 0;
        do{
            buff = (int)(Math.random() * multiplier);
        }
        while(tester.contains(buff));        

        // Here we add the new value to the ArrayList
        newValue = buff; 
        tester.add(newValue);

        // This is a debug line that shows the new value that is being added.
        if(tester.contains(newValue)){
            System.out.println("We added: " + newValue);
        }
        System.out.println(" ");

        displayList();
        
        System.out.println("Demonstrating the removal of the new value from the ArrayList");
        /*We are using the iterator to remove the new value from the list.*/
        iterator = tester.iterator();
        while(iterator.hasNext()){
            buff = iterator.next();
            if(buff == newValue){
                iterator.remove();
            }
        }
        displayList();

        // Here we are re-adding the value to the list, so that we can use the remove function
        // in the ArrayList class.
        tester.add(newValue);
        System.out.println("Displaying the original list");
        displayList();
        int idx = tester.indexOf(newValue);
        tester.remove(idx);
        
        System.out.println("Displaying the list with the value removed");
        displayList();
    }

    public void displayList(){
        System.out.println(printList());
        System.out.println(" ");
    }

    public String printList(){
        StringBuilder sb = new StringBuilder();
        Iterator<Integer> iterator = tester.iterator();
        int buff = 0;

        while(iterator.hasNext()){
            buff = iterator.next();
            sb.append(buff);
            sb.append("\n");
        }
        return sb.toString();
    }
}

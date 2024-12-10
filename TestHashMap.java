import java.util.*;

/**
 * This is my HashMap class. Here we create an initialize a HashMap where the key
 * is a String (representing a category) and the value is an integer. I have 5 categories
 * with corresponding values (in this case how much I "own" of each category item). We then
 * use the iterator to increase the count of an item (add 10 extra values to the Book category)
 * and to remove a category (category 4 in this case (TV shows)) and print it out.
 */
public class TestHashMap
{
    public static final String category1 = "Books";
    public static final String category2 = "Movies";
    public static final String category3 = "Music";
    public static final String category4 = "TV Shows";
    public static final String category5 = "Podcasts";

    public static final int value1 = 150;
    public static final int value2 = 200;
    public static final int value3 = 500;
    public static final int value4 = 50;
    public static final int value5 = 5;
    public static final int INCREMENT_VALUE = 10;
    public static final int TOTAL_CATEGORIES = 5;

    private HashMap<String, Integer> tester;
    public static final int NOT_FOUND = -1;
    public TestHashMap()
    {
        tester = new HashMap<String, Integer>();
    }

    // This just returns the internal HashMap for unit testing.
    public HashMap<String, Integer> getHashMap(){
        return tester;
    }

    // Here we are inserting the categories and their values.
    // The values are the quantity of each item in a category.
    public void insertCategories(){
        tester.put(category1, value1);
        tester.put(category2, value2);
        tester.put(category3, value3);
        tester.put(category4, value4);
        tester.put(category5, value5);

        Iterator<Map.Entry<String, Integer>> iter = tester.entrySet().iterator();
        System.out.println("This is the original keys/values inserted into the HashMap");
        while(iter.hasNext()){
            Map.Entry<String, Integer> item = iter.next();
            System.out.println(item.getKey() + " : " + item.getValue());
        }        
    }

    // Returns the current size of the HashMap
    public int getNumberOfEntries(){
        return tester.size();
    }

    // Returns whether or not a category(key) is found in the HashMap.
    public boolean keyFound(String key){
        boolean found = false;
        Iterator<Map.Entry<String, Integer>> iter = tester.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String, Integer> item = iter.next();
            if(key == item.getKey()){
                return true;
            }
        }        
        return found;
    }

    // If the category exists in the HashMap, then the value is returned. Else the constant NOT_FOUND is returned.
    public int returnValue(String key){
        Iterator<Map.Entry<String, Integer>> iter = tester.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String, Integer> item = iter.next();
            if(key == item.getKey()){
                return item.getValue();
            }
        }
        return NOT_FOUND;
    }

    // Demonstrates functionality of using an Iterator with the HashMap to remove and replace values. And to display the HashMap.
    public void run(){

        insertCategories();
        Iterator<Map.Entry<String, Integer>> iter = tester.entrySet().iterator();
        System.out.println("");

        // Resetting the iterator
        iter = tester.entrySet().iterator();
        String key = "";
        Integer value;
        System.out.println("This is displaying the value being incremented by 10");
        while(iter.hasNext()){
            Map.Entry<String, Integer> item = iter.next();
            key = item.getKey();
            value = item.getValue();
            if(key == category1){
                tester.replace(key, value, value + INCREMENT_VALUE);
            }
            if(key == category4){
                iter.remove();
            }
            System.out.println(item.getKey() + " : " + item.getValue());
        }        
        System.out.println("");
        iter = tester.entrySet().iterator();
        System.out.println("This is displaying the HashMap with an entry removed");

        while(iter.hasNext()){
            Map.Entry<String, Integer> item = iter.next();
            System.out.println(item.getKey() + " : " + item.getValue());
        }          
    }
}

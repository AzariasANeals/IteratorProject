import java.util.*;

/**
 * This is my TreeMap class. In this class we create and populate a 
 * TreeMap where the keys are months (Strings) and the values are average temperatures (Doubles).
 * I used the average temperatures for Dallas, TX in 2023 & 2024. We then use an iterator 
 * over the entrySet() to find the highest and lowest temperatures and the corresponding months and
 * print it out.
 */
public class TestTreeMap
{
    public static final String m1 = "January";
    public static final String m2 = "February";
    public static final String m3 = "March";
    public static final String m4 = "April";
    public static final String m5 = "May";
    public static final String m6 = "June";
    public static final String m7 = "July";
    public static final String m8 = "August";
    public static final String m9 = "September";
    public static final String m10 = "October";
    public static final String m11 = "November";
    public static final String m12 = "December";

    public static final double t1 = 43.0;
    public static final double t2 = 57.7;
    public static final double t3 = 61.8;
    public static final double t4 = 68.7;
    public static final double t5 = 77.3;
    public static final double t6 = 84.2;
    public static final double t7 = 85.1;
    public static final double t8 = 88.9;
    public static final double t9 = 79.4;
    public static final double t10 = 74.7;
    public static final double t11 = 57.8;
    public static final double t12 = 52.8;

    // These are for the unit test to verify our functions.
    public static final double HIGH_TEMP = t8;
    public static final double LOW_TEMP = t1;
    public static final String HIGH_TEMP_MONTH = m8;
    public static final String LOW_TEMP_MONTH = m1;
    public static final double INVALID_LOW_TEMP = 200;
    public static final double INVALID_HIGH_TEMP = -200;
    public static final String MONTH_NOT_FOUND = "";
    private TreeMap<String, Double> tester;
    public TestTreeMap()
    {
        tester = new TreeMap<String, Double>();
    }

    public void insertData(){
        tester.put(m1, t1);
        tester.put(m2, t2);
        tester.put(m3, t3);
        tester.put(m4, t4);
        tester.put(m5, t5);
        tester.put(m6, t6);
        tester.put(m7, t7);
        tester.put(m8, t8);
        tester.put(m9, t9);
        tester.put(m10,t10);
        tester.put(m11,t11);
        tester.put(m12,t12);
    }

    public double getLowTemp(){
        double lowTemp = INVALID_LOW_TEMP;
        Iterator<Map.Entry<String, Double>> iter = tester.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String, Double> item = iter.next();
            if(item.getValue() < lowTemp){
                lowTemp = item.getValue();
            }

        }
        return lowTemp;
    }

    public double getHighTemp(){
        double highTemp = INVALID_HIGH_TEMP;
        Iterator<Map.Entry<String, Double>> iter = tester.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String, Double> item = iter.next();

            if(item.getValue() > highTemp){
                highTemp = item.getValue();
            }

        }
        return highTemp;
    }

    public String getLowTempMonth(){
        String lowMonth = MONTH_NOT_FOUND;
        double lowTemp = getLowTemp();
        Iterator<Map.Entry<String, Double>> iter = tester.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String, Double> item = iter.next();
            if(item.getValue() == lowTemp){
                lowTemp = item.getValue();
                lowMonth = item.getKey();
            }

        }
        return lowMonth;

    }

    public String getHighTempMonth(){
        double highTemp = getHighTemp();
        String highMonth = MONTH_NOT_FOUND;
        Iterator<Map.Entry<String, Double>> iter = tester.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String, Double> item = iter.next();

            if(item.getValue() == highTemp){
                highMonth = item.getKey();
            }

        }
        return highMonth;

    }

    public void run(){
        insertData();
        double highTemp = INVALID_HIGH_TEMP;
        String highMonth = MONTH_NOT_FOUND;
        String lowMonth = MONTH_NOT_FOUND;
        double lowTemp = INVALID_LOW_TEMP;
        Iterator<Map.Entry<String, Double>> iter = tester.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String, Double> item = iter.next();
            if(item.getValue() < lowTemp){
                lowTemp = item.getValue();
                lowMonth = item.getKey();
            }

            if(item.getValue() > highTemp){
                highTemp = item.getValue();
                highMonth = item.getKey();
            }
            System.out.println(item.getKey() + " : " + item.getValue());
        }
        System.out.println("");

        System.out.println("The Highest Temperature Average was " + highTemp + " in " + highMonth);
        System.out.println("The Lowest Temperature Average was " + lowTemp + " in " + lowMonth);
    }
}

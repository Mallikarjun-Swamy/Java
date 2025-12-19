package collectionFramework.list.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ListToArray {
    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(10);
        integerArrayList.add(5);
        integerArrayList.add(8);
        integerArrayList.add(7);
        integerArrayList.add(9);
        System.out.println(integerArrayList);

        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("Hello", "How", "Are", "You", "This", "is", "Arjun"));
        System.out.println(stringArrayList);

        // this is one way, but it returns object Array
        Object[] array = integerArrayList.toArray();
        System.out.println("Length : " + array.length);
        for (Object o : array) {
            System.out.println(o);
        }

        //2nd way, Pass Type of Array with 0 size

        //1. for Integer Array
        Integer[] intArray = integerArrayList.toArray(new Integer[0]);
        System.out.println("intArray size : " + intArray.length);
        for (Integer i : intArray){
            System.out.println(i);
        }


        //2. for String Array
        String[] stringArray = stringArrayList.toArray(new String[0]);
        System.out.println("String Array Length"+stringArray.length);
        for (String s : stringArray){
            System.out.println(s);
        }


        //Sorting -  default sorting (Using Comparable which uses CompareTo() method)
        integerArrayList.sort(null);       //Default Sorting for Numbers-Ascending Order
        System.out.println(integerArrayList); //Prints in Ascending Order

        // Customized Sorting - Using Comparator Object - which uses compare(ob o1, ob o2) method
        MyIntComparator intComparator = new MyIntComparator();  //create customized comparator object and pass it sort function
        integerArrayList.sort(intComparator);             //Customized Sorting
        System.out.println(integerArrayList);

        //Sorting -  default sorting (Using Comparable which uses CompareTo() method)
        stringArrayList.sort(null);        //Default Sorting for String- Alphabetical Order
        System.out.println(stringArrayList);  //prints According to Alphabetical order, uppercase first (lexicographical)

        // Customized Sorting - Using Comparator Object - which uses compare(ob o1, ob o2) method
        MyStringComparator stringComparator = new MyStringComparator();
        stringArrayList.sort(stringComparator);
        System.out.println(stringArrayList);
    }

}

class MyIntComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}

class MyStringComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        return s2.compareTo(s1);
    }
}
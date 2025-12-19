package collectionFramework.list.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ComparableAndComparator {

    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(10);
        integerArrayList.add(5);
        integerArrayList.add(8);
        integerArrayList.add(7);
        integerArrayList.add(9);
        System.out.println("Original Int AL : " + integerArrayList);

        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("Hello", "How", "Are", "You", "This", "is", "Arjun"));
        System.out.println("Original String AL : " + stringArrayList);

        // Using Comparable
        integerArrayList.sort(null);
        System.out.println("comparable int sort : " + integerArrayList);//default Natural Sorting - Ascending Order
        stringArrayList.sort(null); //default Natural Sorting - Alphabetical Order
        System.out.println("comparable String sort : " + stringArrayList);

        //Using Comparator
        //1. Using Java 8+ for integer
        //integerArrayList.sort((i1, i2) -> i1 - i2); //Ascending Order - using custom formula
        //or
        integerArrayList.sort(Comparator.naturalOrder());  // //Ascending Order - using inbuilt static method
        System.out.println("comparator int - ascending : " + integerArrayList);

        //integerArrayList.sort((i1, i2) -> i2 - i1); //Descending Order - using custom formula
        //or
        integerArrayList.sort(Comparator.reverseOrder()); //Descending Order - using inbuilt static method
        System.out.println("comparator int - Descending : " + integerArrayList);

        //1. using Java 8+ for Strings
        // stringArrayList.sort((s1, s2) -> s1.compareTo(s2)); // alphabetical order
        //or
        stringArrayList.sort(Comparator.naturalOrder()); // alphabetical order
        System.out.println("Comparator String natural : " + stringArrayList);

        //stringArrayList.sort((s1, s2) -> s2.compareTo(s1)); // Reverse alphabetical order
        //or
        stringArrayList.sort(Comparator.reverseOrder()); // Reverse alphabetical order
        System.out.println("Comparator String reverse : " + stringArrayList);

//        //2. using Anonymous Inner class - for  Integer
//        integerArrayList.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2.compareTo(o1);
//            }
//        });
//
//        System.out.println(integerArrayList);
//
//        stringArrayList.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });
//
//        System.out.println(stringArrayList);
    }

}

class IntComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return 0;
    }
}


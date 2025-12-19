package collectionFramework.list.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayListConstructors {

    public static void main(String[] args) {

        // Different Constructors of arrayList

        // 1 . No arg Constructor
        ArrayList<Integer> list = new ArrayList<>();
        //Create a arrayList of Default capacity 10;
        // but there is no method to check the capacity, (we can use reflection to check)

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list.size());
        System.out.println(list);

        System.out.println("----------------------");

        // 2 . initialCapacity argument Constructor
        ArrayList<String> list2 = new ArrayList<>(100);
        //Creates a ArrayList of size 100;
        list2.add("Ram");
        list2.add("Sham");
        list2.add("RadheSham");
        System.out.println(list2.size());
        System.out.println(list2);
        list2.trimToSize(); //trims the extra capacity, keeps only how many elements present


        System.out.println("------------------------");

        //  3. Collection object argument Constructor

        List<String> list1 = Arrays.asList("Apple", "Banana", "Cherry");
        list1.add("Apple");
        //Will get java.lang.UnsupportedOperationException , since list does not implemented any modification methods

        ArrayList<String> list3 = new ArrayList<>(list1);
        list3.add("Pineapple");
        System.out.println(list3);

    }
}

package java8.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class StreamClass {

        public static void main(String[] args) {

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(0);
        arrayList1.add(5);
        arrayList1.add(25);
        arrayList1.add(11);
        arrayList1.add(56);
        arrayList1.add(20);
        arrayList1.add(10);
        System.out.println("Original List : " + arrayList1);

        //use filter for filtering object based on some condition and return new stream
        List<Integer> evenIntegers = arrayList1.stream().filter(e->(e&1) == 0).toList();
        System.out.println("Even Number List : " +  evenIntegers);

        //for counting number of objects
        long totalEvenObjects = arrayList1.stream().filter(e->( e % 2) == 0).count();
        System.out.println("Counts of even numbers : " +  totalEvenObjects);


        //use map, when you want to perform some operation on each object and return new stream
        List<Integer> updatedList = arrayList1.stream().map(e->e+10).toList();
        System.out.println("Updated List : " + updatedList);


        //use for each for processing each element and this doesn't return new stream
        evenIntegers.forEach(e-> System.out.println(2*e));

        //for sorting
        List<Integer> sortedList = arrayList1.stream().sorted().filter(e->e>10).toList();
        System.out.println("Sorted List (which are > 10) : " + sortedList);


        //for reverse sorting
        List<Integer> reverseSortedList = arrayList1.stream().sorted((a,b) -> b.compareTo(a) ).filter(e-> e > 10).toList();
        System.out.println("Reverse Sorted List (which are > 10) : " + reverseSortedList);


    }

}




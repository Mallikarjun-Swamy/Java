package collectionFramework.list.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListConversions {
    public static void main(String[] args) {

        // --- 1. ARRAY TO LIST CONVERSIONS ---
        String[] fruits = {"Mango", "Apple", "Banana"};

        //Fixed size Array - backed by array
        List<String> fixedList = Arrays.asList(fruits);
        //fixedList.add("Hello"); //will get UnsupportedOperationException
        System.out.println(fixedList);

        System.out.println("1---------------------------------");

        //Mutable Array - Backed by ArrayList
        ArrayList<String> mutableList = new ArrayList<>(fixedList);
        System.out.println(mutableList);
        mutableList.add("Test");  // adds new element fully, mutable
        System.out.println(mutableList);
        mutableList.remove("Test");// removes, element
        System.out.println(mutableList);

        System.out.println("2---------------------------------");

        //Immutable list Java 9+ Factory (Immutable)
        List<String> immuatableList = List.of("Apple", "Banana", "Hello");
        System.out.println(immuatableList);


        System.out.println("3-------------------------------------");
        // --- 2. PRIMITIVE ARRAY TO LIST (The Tricky Part) ---
        int[] primitiveArray = {1, 5, 8, 6, 7, 6, 4};

        ArrayList<Integer> primList = new ArrayList<>();
        for(Integer ele:primitiveArray){
            primList.add(ele);
        }
        System.out.println(primList);


    }


}

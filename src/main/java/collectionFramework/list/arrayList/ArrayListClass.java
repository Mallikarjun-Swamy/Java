package collectionFramework.list.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
      //  ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 8, 8, 5, 5, 5)); // adding multiple elements
      //  ArrayList<Number> number2 = new ArrayList<>(Arrays.asList(2, 5, 8, 4,6, 8));


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(26);
        numbers.add(8);
        numbers.add(280);  // for adding a single element
        numbers.add(27);
        System.out.println(numbers);

    // access element using index,
        //System.out.println(numbers.get(2));

        //using loops
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("---------------------");

        System.out.print("[");
        for (int number : numbers){
            System.out.print(number+ " ");
        }
        System.out.println("]");




    }
}


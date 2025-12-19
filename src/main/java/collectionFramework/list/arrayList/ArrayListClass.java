package collectionFramework.list.arrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("this", "Hello");
        System.out.println(list.getClass().getName());

        List<String> list1 = List.of("Hello", "I am ","AH");
        System.out.println(list1.getClass().getName());



    }
}


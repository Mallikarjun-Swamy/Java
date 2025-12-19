package collectionFramework.list.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiffBetweenNewArrayList_asList_andOfMethod {

    public static void main(String[] args) {

        String[] strArray = {"Pradeep", "Arjun", "Mallik", "Swamy"};

        // 1. List.of() method
        List<String> immutableList = List.of(strArray);
      //immutableList.add("HiList"); //can not able to modify, will get UnsupportedException
      //immutableList.set(0, "hello"); //can not able to modify, will get UnsupportedException
      //immutableList.remove("Arjun");  //can not able to modify, will get UnsupportedException
        System.out.println(immutableList);


        // 2. Arrays.asList() method
        //List<String> replaceableList = Arrays.asList(immutableList); // it needs only Array not any Collection list
        List<String> replaceableList = Arrays.asList(strArray);
        System.out.println(replaceableList.get(0));
        replaceableList.set(0,"Sandeep");     // allowed, since we are just replacing the existing value, and
                                             // not modifying the Array
        System.out.println(replaceableList.get(0));
        //replaceableList.add("Amar"); // Not Allowed, since it will add, a new element at the last
                                    // since the array is fixed size.


        // 3. Normal ArrayList constructor

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Aman");
        arrayList.add("Amar");
        System.out.println(arrayList);
        arrayList.set(1, "Alok");
        arrayList.add("Anjali");
        System.out.println(arrayList);












    }

    /*
    1. List.of(...) (The Strictly Immutable Snapshot):
        Choose List.of if the data is a constant or shouldn't change
        (e.g., status codes, configuration). It's the safest and most modern approach.

        The Concept: Introduced in Java 9, this creates a "read-only" snapshot.
        It is completely disconnected from any input arrays and is highly optimized for performance.

            List<String> snapshot = List.of("Red", "Green", "Blue");

            // snapshot.add("Yellow"); // ❌ Exception
            // snapshot.set(0, "Pink"); // ❌ Exception (Strictly Immutable)
            // List.of("A", null);     // ❌ Exception (Nulls are forbidden)

            Notes for Interviewer: "This is strictly immutable. It is thread-safe by design because it cannot
            be modified. It also has a smaller memory footprint than ArrayList because it doesn't
            need to maintain extra capacity for growth.
            It is 'fail-fast'—it throws a NullPointerException if you try to include a null value."


        Implementations (Outer and Inner class details)
            External Type: java.util.List (I)
            Internal Class: java.util.ImmutableCollections$List12 or java.util.ImmutableCollections$ListN

            The Details: Java 9+ uses "space-efficient" internal classes found in the ImmutableCollections utility class.

            If you provide 1 or 2 elements, it uses List12 (which stores elements in fields to
            avoid the overhead of an array).

            If you provide 3 or more, it uses ListN (which uses a compact array).

            Interviewer Note: "These classes are completely hidden from the user.
            They are designed to be extremely memory-efficient and are optimized for read-heavy
            operations where thread safety (immutability) is required."



    2. Choose Arrays.asList if you have a large array and want to avoid the cost of copying memory,
        or if you want changes in the list to reflect in the original array.

         The Concept: This does not copy the data. It wraps the existing array in a "List skin."
         The array and the list are literally pointing to the same memory.

             String[] arr = {"A", "B"};
             List<String> list = Arrays.asList(arr);

             // list.add("C"); // ❌ Throws UnsupportedOperationException (Array size is fixed!)

            list.set(0, "Z"); // ✅ Success (This changes BOTH list and arr[0])
            System.out.println(arr[0]); // Prints "Z"

            Notes for Interviewer: "This is a 'view' of an array. It’s highly memory-efficient because
            it doesn't duplicate the elements. However, it's structurally fixed—you can modify elements (set),
            but you can't change the size (add/remove).
            I use this when I need to pass an existing array into a method that requires a List interface."

            Implementations (Outer and InnerClasses)

            External Type:  java.util.List
            Internal Class: java.util.Arrays$ArrayList
            The Details: This is NOT the same as java.util.ArrayList.
                         It is a private static inner class defined inside the java.util.Arrays class.
                         It is "sneaky" because it has the same name but different powers.

            Why it's different: Because it is an inner class of Arrays, it can directly point to the
            original array you passed in. It does not implement the add() or remove() methods,
            which is why it is fixed-size.

      3. Choose new ArrayList<>(...) if you need to perform additions or removals.
         You can wrap either of the other two methods in this constructor to "unlock"
         mutability: List<String> editable = new ArrayList<>(List.of("A", "B"));

         Use this when we need a collection that will grow or shrink during the lifecycle of the application.
         It is independent of any other data source, meaning changes here don't affect anything else.

                List<String> mutableList = new ArrayList<>();
                mutableList.add("Java");      // ✅ Success
                mutableList.add("Python");   // ✅ Success
                mutableList.remove(0);       // ✅ Success

          External Class: java.util.ArrayList
          Internal Class: java.util.ArrayList
          The Details: This is the only one where the class you use is the actual class that is instantiated.
          It uses a transient Object[] elementData internally to store the elements.

          Interviewer Note: "This is the standard dynamic array implementation we all know.
          It is public and found directly in the java.util package."

     */
}

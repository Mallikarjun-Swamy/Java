package strings.methodsOfStringClass;

import java.util.ArrayList;
import java.util.List;

public class Join {

    //String.join()
    //String.join() is a static method in Java used to join multiple
    // strings into one single string using a delimiter (separator).

    //Signatures
    //public static String join(CharSequence delimiter, CharSequence... elements)
    //public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)

    public static void main(String[] args) {
        String result1 = String.join(",", "Java", "Python", "C++");
        System.out.println(result1);

        String result2 = String.join("\n", "Java", "Python", "C++");
        System.out.println(result2);

        //Real-Time Use Cases
        //CSV File Creation (Data Export)

        String[] user = {"101", "John Doe", "john@example.com"};
        String csvLine = String.join(",", user);
        System.out.println(csvLine);

        //Display Skills/Tags in UI (Web/Mobile App)
        List<String> skills = List.of("Java", "Spring Boot", "MySQL");
        String formatted = String.join(" | ", skills);
        System.out.println(formatted);

        //Building Query Strings (REST API / URL params)

        String query = String.join("&", "page=1", "size=20","sort=name");
        System.out.println(query);

        //-----------------------------------------------------------------------------
        //using Iterable constructor

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Vegetables");
        shoppingList.add("Fruits");

        System.out.println(shoppingList);

        String list = String.join(" | ", shoppingList);
        System.out.println(list);

        // example,
//        String startTag = "<li>";
//        String endTag = "</li>";
//        List<String> htmlList = new ArrayList<>();
//
//        for(int i = 0; i<shoppingList.size(); i++ ){
//            htmlList.add(String.join("", startTag,shoppingList.get(i),endTag));
//        }
//        System.out.println(htmlList);


        //or
        String htmlList = "<li>" +  String.join("</li><li>", shoppingList) + "</li>";
        System.out.println("\nHTML List (Partial):");
        System.out.println(htmlList);
        String text = "A😀B";
        text.codePoints().forEach((value) -> {
            System.out.println((char) (value));
        });
    }



}

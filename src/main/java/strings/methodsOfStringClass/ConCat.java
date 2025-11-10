package strings.methodsOfStringClass;

public class ConCat {

    //concat()
    // This is used to join (concatenate) two strings together.

    public static void main(String[] args) {
        String first = "Hello";
        String second = "World";

        String message = first.concat(" ").concat(second);
        System.out.println(message);  // Hello World

        String abc = "a";
        abc = abc.concat("b").concat("c");
        System.out.println(abc); //abc


        //Real-World Examples

        //1. Building a file path

        String folder = "/user/data/";
        String file = "report.pdf";

        String fullPath = folder.concat(file);
        System.out.println(fullPath);                // /user/data/report.pdf


        //1. URL building in REST APIs

        String baseUrl = "https://api.example.com/";
        String endpoint = "users";
        String id = "123";

        String url = baseUrl.concat(endpoint).concat("/").concat(id);
        System.out.println(url);     // https://api.example.com/users/123
    }


}

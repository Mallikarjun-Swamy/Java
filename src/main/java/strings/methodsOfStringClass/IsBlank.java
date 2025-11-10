package strings.methodsOfStringClass;

public class IsBlank {

    // isBlank() Method
    // This ,Method introduced in Java 11,
    // checks if the string is empty or contains only whitespace characters

    // Real-time Application:
    // Essential for form validation in web applications to prevent empty fields from being submitted to a database.

    public static void main(String[] args) {

        String empty = "";
        String blank = "    ";

        System.out.println(empty.isBlank());  //true
        System.out.println(empty.isEmpty());  //true
        System.out.println(blank.isBlank());  //true
        System.out.println(blank.isEmpty());  //false (whitespaces are there, hence it is not empty)

        //Example — user input validation
        String username = "   ";
        if (username.isBlank()) {
            System.out.println("Username cannot be blank!");
        }



    }




}

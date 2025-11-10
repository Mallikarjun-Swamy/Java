package strings.methodsOfStringClass;

public class Length {

    //Length() Method,
    // This Methode, returns the length (number of characters) of the string, including spaces.
    public static void main(String[] args) {
        String name =  "Mallikarjun Swamy";

        //M a l l i k a r j u  n     S  w  a  m  y
        //1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17

        int length  = name.length();
        System.out.println(length); // 17

        String empty = "";
        System.out.println(empty.length()); //0

        String blank = " ";
        System.out.println(blank.length()); // 1 (one space)

        //Real-world example:
        String password = "Hello123";
        if (password.length() < 8) {
            System.out.println("Password too short, please enter at least 8 characters.");
        } else {
            System.out.println("Password accepted!");
        }


    }


}

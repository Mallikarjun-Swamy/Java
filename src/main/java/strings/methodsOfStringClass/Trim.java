package strings.methodsOfStringClass;

public class Trim {

    //trim() Method,
    //This method removes all leading (beginning) and trailing (end) whitespace characters from a string.
    //It does not remove spaces inside the string (between words).

    public static void main(String[] args) {
        String greet = "   Hello Java!   ";
        String result = greet.trim();
        System.out.println(result);

        //Real-World Examples
        // 1. Form Input Sanitization

        String username = "  Mallikarjun  ";
        if (username.trim().equals("Mallikarjun")) {
            System.out.println("✅ User matched!");
        }

        //2.Checking Empty Input Fields

        String input = "     ";

        if (input.trim().isEmpty()) {
            System.out.println("❌ Please enter some text.");
        }
    }
}

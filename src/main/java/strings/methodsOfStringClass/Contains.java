package strings.methodsOfStringClass;

public class Contains {

    //contains() Method, (Case Sensitive)
    //The contains() method is used to check whether a given substring exists within a string.
    //It returns a boolean (true or false).

    //signature
    //public boolean contains(CharSequence sequence)

    public static void main(String[] args) {

        String greet = "Good morning!";
        boolean result = greet.contains("morning");
        System.out.println(result);   //true


        String str = "Java Programming";
        System.out.println(str.contains("java"));  // false
        System.out.println(str.toLowerCase().contains("java")); // true


        //-----------------------------------------------------------------
        //Real-World Examples
        // 1. Keyword Search in User Input
        String title = "Learn Java the Easy Way!";
        String query = "Java";

        if (title.contains(query)) {
            System.out.println("✅ Match found!");
        } else {
            System.out.println("❌ No match found.");
        }

        //2. Validating Email Addresses

        String email = "mallikarjun@gmail.com";

        if (email.contains("@") && email.contains(".")) {
            System.out.println("✅ Possibly a valid email");
        } else {
            System.out.println("❌ Invalid email format");
        }

    }
}

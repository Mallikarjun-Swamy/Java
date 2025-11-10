package strings.methodsOfStringClass;

public class Replace {

    //replace() -
    //This method is used to replace characters or substrings in a string with new values.

    //There are two overloaded versions of replace()
    //  String replace(char oldChar, char newChar)
    //  String replace(CharSequence target, CharSequence replacement)

    public static void main(String[] args) {

        String name = "Mallikarjun";
        String result1 = name.replace('a', 'o');
        System.out.println(result1);   //Mollikorjun


        //Real-World Examples

        String phone = "(123) 456-7890";
        String formatted = phone.replace('(', '[').replace(')', ']');
        System.out.println(formatted);    // [123] 456-7890

        //---------------------------------------------------------------

        String text = "I love Java. Java is powerful.";
        String result = text.replace("Java", "Python");
        System.out.println(result);                    // I love Python. Python is powerful.

        //Real-World Example
        // Replacing placeholders
        String template = "Dear {name}, your OTP is {otp}";
        String personalized = template
                .replace("{name}", "Mallikarjun")
                .replace("{otp}", "746182");
        System.out.println(personalized);                 // Dear Mallikarjun, your OTP is 746182


        //URL normalization
        String url = "https://MySite.Com/Home Page";
        String normalized = url.replace(" ", "%20").toLowerCase();
        System.out.println(normalized);                   // https://mysite.com/home%20page

    }

}

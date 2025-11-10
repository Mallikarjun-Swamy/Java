package strings.methodsOfStringClass;

public class UpperCaseAndLowerCase {


    //toUpperCase() Method,
    //Converts all characters in the string to uppercase letters.


    //toLowerCase()
    //Converts all characters in the string to lowercase letters

    public static void main(String[] args) {
        String sku = "ab123cd";
        String standardizedSku = sku.toUpperCase();
        System.out.println(standardizedSku);

        String reportTitle = "MONTHLY REVENUE SUMMARY";
        System.out.println(reportTitle.toLowerCase());

//----------------------------------------------------------------------
        //Real-World — User input normalization
        String inputEmail = "User@Gmail.com";
        String storedEmail = "user@gmail.com";

        if (inputEmail.toLowerCase().equals(storedEmail.toLowerCase())) {
            System.out.println("✅ Email match");
        } else {
            System.out.println("❌ Invalid email");
        }
    //---------------------------------------------------------------------
        //Case-insensitive searching

        String userQuery = "JAVA";
        String articleTitle = "introduction to Java Programming";

        if (articleTitle.toLowerCase().contains(userQuery.toLowerCase())) {
            System.out.println("Result found!");
        }

    }

}

package strings.methodsOfStringClass;

public class SubString {

    //substring(int startIndex)
    // Extracts a portion of the string, goes from the startIndex to the end of the String.


    //substring(int startIndex, int endIndex)
    //Extracts a portion of the string, goes from the startIndex to the (endIndex - 1).
     //

    public static void main(String[] args) {
        String url = "https://www.example.com";
        String domain1 = url.substring(12);       // "example.com"
        String domain2 = url.substring(12, 19);             // "example"
        System.out.println(domain1);
        System.out.println(domain2);



        //Real-Time Uses
        //1. getting Domain name

        String email = "arjun@google.com";
        String domain =  email.substring(email.indexOf('@')+1);
        System.out.println(domain);

        //2. getting file Extension
        String fileName = "document.pdf";
        String extention = fileName.substring(fileName.indexOf('.')+1);
        System.out.println(extention);

        //3. Displaying a short preview of text (trimming long messages)
        String message = "This is a long message that won’t fit in the preview box.";
        String preview = message.substring(0, 25) + "...";
        System.out.println(preview); // Output: This is a long message t...

    }

}

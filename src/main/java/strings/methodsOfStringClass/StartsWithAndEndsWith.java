package strings.methodsOfStringClass;

public class StartsWithAndEndsWith {

    //startsWith()  (case-sensitive)
    //This method checks whether a string begins with a specified prefix.

    //Signatures:
    //public boolean startsWith(String prefix)
    //public boolean startsWith(String prefix, int toffset)


    //endsWith() (case-sensitive)
    //This method checks whether a string ends with a specific suffix.
    //Signatures : public boolean endsWith(String suffix)

    public static void main(String[] args) {

        String program = "Java Programming";
        System.out.println(program.startsWith("Java"));  // true
        System.out.println(program.startsWith("Pro"));   // false


        String greet = "WelcomeToJava";
        System.out.println(greet.startsWith("come", 3));  // true

        //Real-World Examples
        // 1 — Checking URL Prefix

        String url = "https://trivixdata.com";

        if (url.startsWith("https://")) {
            System.out.println("✅ Secure connection detected");
        } else {
            System.out.println("⚠️ Insecure connection!");
        }

        //2 — Custom Prefix Validation

        String id = "EMP12345";

        if (id.startsWith("EMP")) {
            System.out.println("👔 Employee ID detected");

        }

    //-----------------------------------------------------------------------------------------

        String file = "document.pdf";

        System.out.println(file.endsWith(".pdf"));  // true
        System.out.println(file.endsWith(".txt"));  // false


        //Real-World Example
        // 1 — Validating File Types

        String upload = "photo.jpeg";

        if (upload.endsWith(".jpeg") || upload.endsWith(".jpg") || upload.endsWith(".png")) {
            System.out.println("🖼️ Image file uploaded");
        } else {
            System.out.println("⚠️ Invalid file type");
        }

        //2 — Checking Email Domain

        String email = "arjun@trivixdata.com";

        if (email.endsWith("@trivixdata.com")) {
            System.out.println("✅ Internal company email");
        } else {
            System.out.println("❌ External email");
        }

    }

}

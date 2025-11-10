package strings.methodsOfStringClass;

public class EqualsAndEqualsIgnoreCase {

    //equals() Method  (it is case-sensitive)
    // By Default equals() method in Object class, compares references (memory address),
    // But in String (and in some other class) this method is overridden to compare the content inside the given two objects
    //(other classes where equals() method overridden are , all Wrapper class, and collection classes)

    //equalsIgnoreCase() Method (it is case-insensitive)
    // This method applies to string, and this will compare the content of the two provided String,
    // without considering Character case


    public static void main(String[] args) {
        String user1 = "admin";
        String user2 = "Admin";
        System.out.println(user1.equals(user2));          // false
        System.out.println(user1.equalsIgnoreCase(user2)); //true
    //--------------------------------------------------------
        //Real-world example:
        String savedPassword = "MyPass123";
        String inputPassword = "MyPass123";

        if (savedPassword.equals(inputPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid password!");
        }
    //--------------------------------------------------------------
        //Real-world example:
        String savedEmail = "user@gmail.com";
        String inputEmail = "USER@GMAIL.COM";
        if (savedEmail.equalsIgnoreCase(inputEmail)) {
            System.out.println("Same email address.");
        }





    }



}

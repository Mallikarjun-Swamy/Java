package strings.methodsOfStringClass;

public class CharAt {

    //charAt(int index) Method
    //Returns the character at a specific index (position),where the first character is at index 0

    //Signature: public char charAt(int index)

    public static void main(String[] args) {

        String name = "Mallikarjun";


        char firstChar = name.charAt(0);
        char randomChar = name.charAt(4);
        char midChar = name.charAt((name.length()-1)/2); //approximate mid Char
        char lastChar = name.charAt((name.length())-1);

        System.out.println(firstChar);   //M - First character at o index
        System.out.println(randomChar);  //i - character at index 4
        System.out.println(midChar);     //k - Approx mid-Char  length()-1/2
        System.out.println(lastChar);    //n last char (always at (length()-1) index

        //char errorChar = name.charAt(100); //this will give StringIndexOutOfBoundsException

        //---------------------------------------------------------------
        //Real-world example:
        String Firstname = "Mallliakrjun";

        if(Character.isUpperCase(Firstname.charAt(0))){
            System.out.println("Valid First Name");
        }else {
            System.out.println("Invalid FirstName");
        }


    }
}

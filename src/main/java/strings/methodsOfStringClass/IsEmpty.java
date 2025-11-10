package strings.methodsOfStringClass;

public class IsEmpty {

    //isEmpty() Method
    //This method determines whether the given String is empty (length zero) or not,
    // if string has length zero returns true, else false

    public static void main(String[] args) {

        String emptyString = new String();
        String name = "Arjun";
        String emptyLiteral = "";
        String whiteSpace = " ";

        boolean isEmpty = emptyString.isEmpty();
        System.out.println(isEmpty);  //true

        System.out.println(name.isEmpty()); //false

        System.out.println(emptyLiteral.isEmpty()); //true

        System.out.println(whiteSpace.isEmpty()); // false (White spaces are considered as character, hence it is the part of length)

        //--------------------------------------------------
        //Real World Example — input validation
        String firstName = "";
        if (name.isEmpty()) {
            System.out.println("firstName cannot be empty");
        }

    }

}

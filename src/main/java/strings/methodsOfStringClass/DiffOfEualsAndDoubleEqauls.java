package strings.methodsOfStringClass;

public class DiffOfEualsAndDoubleEqauls {

   // Difference Between equals() and == operator

    // == operator
    // Checks if both references(memory addresses) point to same object in memory
    //It works both with primitive and Object Types

    //equals()
    //By default in Object class, this method, also compares references(memory addresses).
    //But in most of the classes in Java, it is overridden to check the content of two objects.
    //so in Strings, it is Overridden to check content of two String objects.
    //It wors Only With, Object Types



    public static void main(String[] args) {
        // 1. With Primitive Types
        //For primitives (int, char, boolean, etc.) — only == works because .equals() is not defined.

            int a = 10;
            int b = 10;
            System.out.println(a == b);  //true
            // System.out.println(a.equals(b));  Compile-time error,

        //2.With Objects
            String s1 = new String("Hello");
            String s2 = new String("Hello");

            System.out.println(s1 == s2);        // false (== → checks memory address → different objects, so false)
            System.out.println(s1.equals(s2));   // true  (String class override equals(), so it checks content)

        //3. With Stings and StringBuffer(orBuilder)

            StringBuffer sb1 = new StringBuffer("Java");
            StringBuffer sb2 = new StringBuffer("Java");

            System.out.println(sb1 == sb2);        //false
            System.out.println(sb1.equals(sb2));   //false (StringBuffer does not override equals(), so it behaves like ==)


    }


}

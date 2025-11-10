package strings.methodsOfStringClass;

public class ValueofAndCopyValueof {

    /*

    1. String.valueOf() method:
    Purpose: Convert any data type (primitive or object) into a String.

    Different overloaded methods:---
    String.valueOf(int i)
    String.valueOf(double d)
    String.valueOf(boolean b)
    String.valueOf(char c)
    String.valueOf(char[] data)
    String.valueOf(Object obj)

    For primitives, it returns the text representation (like Integer.toString(i) internally).
    For objects, it calls obj.toString() — unless the object is null, in which case it returns "null".
    For char[], it constructs a new string from the characters.

    examples:
    System.out.println(String.valueOf(123));      // "123"
    System.out.println(String.valueOf(true));     // "true"
    System.out.println(String.valueOf('A'));      // "A"
    System.out.println(String.valueOf((Object)null)); // "null"

    char[] letters = {'J','a','v','a'};
    System.out.println(String.valueOf(letters));  // "Java"

------------------------------------------------------------------------------
     2. String.copyValueOf()

        Purpose: Specifically create a String from a char[].

        OverLoaded methods:
        String.copyValueOf(char[] data)
        String.copyValueOf(char[] data, int offset, int count)

        It only works with char[], not primitives or other objects.
        Internally, it’s identical to new String(char[]) — creates a new string object from the given character array.

        example
        char[] letters = {'J','a','v','a','!'};

        String s1 = String.copyValueOf(letters);       // "Java!"
        String s2 = String.copyValueOf(letters, 0, 4);

     */

    public static void main(String[] args) {
        System.out.println(String.valueOf(123));       // "123"
        System.out.println(String.valueOf(true));      // "true"
        System.out.println(String.valueOf('A'));       // "A"
        System.out.println(String.valueOf((Object)null)); // "null"

        char[] letters = {'J','a','v','a'};
        System.out.println(String.valueOf(letters));  // "Java"

        //--------------------------------------------------

        char[] text = {'J','a','v','a','!'};

        String s1 = String.copyValueOf(text);       // "Java!"
        String s2 = String.copyValueOf(text, 0, 4); // "Java"  (! not included because, it stops at count 4)


    }
}

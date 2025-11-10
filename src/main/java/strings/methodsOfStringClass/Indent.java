package strings.methodsOfStringClass;

public class Indent {
    /*
    The indent(int n) method, introduced in Java 12, is a utility on the String class
    designed to control the indentation of a multi-line string. It provides a simple,
    modern way to add or remove whitespace consistently at the start of every line.

    The method takes a single integer argument, n, which determines the change in indentation level:

    Positive (n > 0) Indentation:
    Inserts n spaces at the beginning of every line(including first).Pushes the content to the right.

    Negative (n < 0) De-dentation:
    Attempts to remove n spaces at the beginning of every line. Pushes the content to the left.

    Zero (n = 0)
    No change in indentation.

     */

    public static void main(String[] args) {

        String s1 = "Header:\n\tItem 1\nItem 2\nItem 3";
        System.out.println("Original String \n" + s1);

        /*
        ----Original String outPut----
        Test line
        Header:
           Item 1   (because of tab)
        Item 2
        Item 3
         */



        System.out.println("Test line");
        System.out.println(s1.indent(5));
        /*
        ----Indention outPut----
        Test line
             Header:  (adds 5 spaces before every line)
                Item 1
             Item 2
             Item 3
         */

        String s2 = "Header:\n\tItem 1\nItem 2\nItem 3";
        System.out.println("Test line");
        System.out.println(s1.indent(-1));

        /*
        ----Indention outPut----
        Test line
        Header:
        Item 1   (remove tab space)
        Item 2
        Item 3
         */


    //---------------------------------------------------------------------

        //stripIndent() — Java 13
        //Syntax: String stripIndent()
        // Removes common leading indentation from all lines.


        String s3 = "   Hello\n   World";
        System.out.println(s3.stripIndent());




    }
}

package strings.methodsOfStringClass;

public class Strip {
    /*

    The methods strip(), stripLeading(), and stripTrailing() were introduced in Java 11
    to provide more robust and Unicode-aware trimming capabilities compared to the older trim() method.

    They primarily differ from trim() in how they handle whitespace characters defined by Unicode

    trim(): Removes characters that have a Unicode value less than or equal
     to $U+0020$ (the space character). This only covers basic ASCII whitespace
    (space, tab, newline, carriage return, etc.).

     strip()/stripLeading()/stripTrailing(): Remove characters that satisfy
     the Character.isWhitespace(char) method. This includes all characters handled by trim(),
     plus many Unicode-specific spaces like the($U+2003$) and various other space characters defined in Unicode.
    (except Non-breaking Space (\00A0)

    1. strip()
        Function: Returns a string with all leading and trailing Unicode-defined whitespace removed.
        Analogy: It is the modern, Unicode-aware equivalent of the older trim() method.


    2. stripLeading()
        Function: Returns a string with only the leading (beginning) Unicode-defined whitespace removed.
        Use Case: Useful when you need to clean up input data by removing initial
        indentation or leading spaces but want to preserve any trailing spaces
        (which might be significant in some formatted data).

    3. stripTrailing()
       Function: Returns a string with only the trailing (ending) Unicode-defined whitespace removed.
       Use Case: Useful when you need to remove extra spaces or newlines
       at the end of a line or file content but need to preserve any leading indentation.

     */

    public static void main(String[] args) {
//        String text = "\u00A0Hello Java\t";
//        System.out.println("Original length -> [" + text.length() +"]");
//
//        int num1 = text.strip().length();
//        System.out.println(num1);
//        int num2 = text.stripLeading().length();
//        System.out.println(num2);
//        int num3 = text.stripTrailing().length();
//        System.out.println(num3);
//        int num4 = text.trim().length();
//        System.out.println(num4);

        String text = "\u00A0Hello Java\t";
        System.out.println("Original length = " + text.length());
        for (int i = 0; i < text.length(); i++) {
            System.out.printf("[%d] U+%04X -> %s%n", i, (int) text.charAt(i), Character.getName(text.codePointAt(i)));
        }

    }

}
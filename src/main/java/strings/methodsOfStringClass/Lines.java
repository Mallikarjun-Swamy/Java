package strings.methodsOfStringClass;

public class Lines {

    /*
    The lines() method, introduced in the Java 11 String class, is designed to easily process multi-line
    strings by returning a stream of strings obtained by splitting the original string at line terminators.

    How lines() Works
    1. Splitting: The method internally scans the entire string and splits it based on any
    recognized line terminator.

    2. Line Terminators: lines() recognizes all standard line breaks,
    including:Newline (LF): \n (used on Unix/Linux/macOS)Carriage Return
    (CR): \r (used on older macOS systems)CRLF: \r\n (used on Windows)Various
    Unicode line-separator characters (e.g., $U+0085$, $U+2028$, $U+2029$).

    3. Stream Output: It returns a Stream<String>, where each element is
     an individual line from the original text.

    4. No Terminators Included: Crucially, the line terminator characters (\n, \r\n, etc.)
     are removed from the resulting stream elements.

    5. Trailing Terminator Handling: If the original string ends with a line terminator (e.g., "Line 1\n"),
      the lines() stream will not include an empty string as the last element.


     */

    public static void main(String[] args) {

        String poem = "Two roads diverged in a yellow wood,\n"
                + "And sorry I could not travel both.\r\n"
                + "And be one traveler, long I stood.";

        poem.lines()
                .map((line) -> line.toUpperCase())
                .forEach(line -> System.out.println(line));

        //or Using shorthand Properties
        System.out.println("-----------------------------------");

        poem.lines()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}

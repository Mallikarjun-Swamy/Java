package strings.methodsOfStringClass;

public class FormatAndFormatted {
    /*

    1. String.format() — static method
     Syntax :   public static String format(String format, Object... args)

     It’s a static method in the String class.
     You call it on the class, not on an instance.
     Introduced in Java 5

     Example:
     String msg = String.format("Hello %s, your score is %d", "Arjun", 95);
     System.out.println(msg);

     2. formatted() — instance method

     Syntax : public String formatted(Object... args)

     It’s an instance method introduced in Java 15.
     You call it on a string object instead of passing the format pattern separately.

     Example
        String template = "Hello %s, your score is %d";
        String msg = template.formatted("Arjun", 95);
        System.out.println(msg);


     */

    public static void main(String[] args) {

        String msg1 = String.format("Name: %s, Age: %d", "Arjun", 25);
        System.out.println(msg1);
        //Name: Arjun, Age: 25

        // New way (Java 15+)
        String msg2 = "Name: %s, Age: %d";
        System.out.println(msg2.formatted("Arjun", 25));
        //Name: Arjun, Age: 25

    }

}

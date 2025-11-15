package general.datatypes;

public class DataTypes {
    /*
        Data Types in Java: -
            Java is a statically typed (Strongly typed) language, which means every variable must be declared with
            a type before using it.

            A Data Types Specifies:
               1. The type of data to be stored in a variable (example like integer, boolean, floating Point, char etc)
               2. The Size of the memory allocated for that variable.
               3. The range of values it can store (like -128 to 127)
               4. The operations which can be performed on that.

             Data types used in almost everywhere in programing in java,
             like in variable declaration, method parameters, method return types, class fields,  conditions and in loops.


         There Mainly two Categories:
            1. Primitive DataType (8 types - byte,short,char,int, float,double,long and boolean)
            2. Non-Primitive (Reference) Data Types. (classes, interfaces, arrays, String, enums, and collections  etc)


         1. Primitive DataType:
            1. Byte:
                Stores whole numbers from -128 to 127 (allocated memory size – 1 byte)
                Used in low-level data handling, file streams, network protocols, and memory-efficient arrays

                example:  byte age = 25;

            2. Short:
                Stores whole numbers from -32,768 to 32,767 (memory size – 2 bytes)
                Useful when dealing with large arrays of integers to save memory.

                example: short temperature = 280;

             3. Int:
                Stores whole numbers from -2,147,483,648 to 2,147,483,647 (-2^31 to (2^31)-1) (memory size – 4 bytes)
                Default choice for integer values in Java applications.

                Example: int salary = 50000;

             4. Long:
                 Stores very large whole numbers (memory size – 8 bytes), Range roughly ±9,22,33,72,036,85,47,75807(-2^63 to (2^63)-1)
                 Used for large counts like population, timestamps, big IDs

                 example: long population = 8000000000L;

             5. Float:
                  Stores decimal numbers in the range ±3.4 × 10³⁸ (memory size – 4 bytes).
                  Used where memory saving is required and precision beyond 7 digits is not needed.

                  example : float interestRate = 7.25f;

              6. Double:
                   Stores large decimal numbers in the range ±1.7 × 10³⁰⁸ (memory size – 8 bytes)
                   Default for decimal values; used in scientific calculations requiring high precision.

                   example : double pi = 3.141592653589;

               7. Char:
                    Stores a single Unicode character (range: 0 to 65,535) (memory size – 2 bytes), default value null character.
                    Used for characters, symbols, Unicode characters like ₹, emojis (some require surrogate pairs).

                    examples: char grade = 'A';  //65 - decimal Unicode value of A
                              char rupee = '\u20B9'; // ₹

                8. Boolean:
                    Stores true or false only, by default false;
                    Used in checking conditions.

                    example : boolean isRaining = true;

     */


    public static void main(String[] args) {

        byte byteMax = -128;
        byte byteMin = 127;
        byteMin +=20;
        System.out.println(byteMin); // if we add beyond the range the value overflow happens
        System.out.println("------------above byte------------------");


        short shortmax = 32767;
        short shortmin = -32768;
        shortmax++;
        shortmax += 25;
        System.out.println(shortmax);
        System.out.println("-----------above short-------------------");

        int intMax = 2147483647;
        int intMin = -2147483648;
        intMax++;  //-2147483648 overflow happens
        System.out.println(intMax);
        System.out.println("------------- above int-----------------");


        float floatNumber = 25.52f; //suffix always f needed
        System.out.println(floatNumber);
        System.out.println("------------ above float------------------");



        double salary = 25000.54;  //default for floating point Number
        System.out.println(salary);
        System.out.println("------------ above double------------------");



        char charInt = 65;  //A
        char charA = 'A';    // A
        char charUnicode = '\u20b9'; //₹ - rupee symbol
        System.out.println(charInt);
        System.out.println(charA);
        System.out.println(charUnicode);

        System.out.println("--------- above char---------------------");

        boolean isRaining = true;
        boolean isTurnedOn = false;

        System.out.println(isRaining);
        System.out.println(isTurnedOn);


    }
}

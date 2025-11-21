package general.datatypes;

public class WideningAndNarrowing {
    public static void main(String[] args) {

        // Widening - happens automatically (done by Java Compiler)
        byte byteWidening = 127;
        System.out.println("Widening byte "+ byteWidening);
        short shortWidening = byteWidening;     // Implicit Widening from byte to Short
        System.out.println("Widening short " + shortWidening);
        int intWidening = shortWidening;        // Implicit Widening from short to int
        System.out.println("Widening int " + intWidening);
        long longWidening = intWidening;        // Implicit Widening from int to long
        System.out.println("Widening Long " + longWidening);
        float floatWidening = longWidening;     // Implicit Widening from long to float
        System.out.println("Widening Float " + floatWidening);
        double doubleWidening = floatWidening;  // Implicit Widening from float to double
        System.out.println("Widening Double " + doubleWidening);

        System.out.println("--------------------------------------");

        // Narrowing - programmer need do it explicitly (Java Compiler won't do it)
        double doubleNarrowing = 2555555485845545.548568445555;
        System.out.println("Narrowing Double " + doubleNarrowing);
        float floatNarrowing = (float) doubleNarrowing;          // Explicit Narrowing done by programmer from double to float
        System.out.println("Narrowing Float " + floatNarrowing); // Loss of precision
        long longNarrowing = (long) floatNarrowing;              // Explicit Narrowing from float to long - loss of data
        System.out.println("Narrowing long " + longNarrowing);
        int intNarrowing = (int) longNarrowing;                  // Explicit Narrowing from long to int - loss of data
        System.out.println("Narrowing int " + intNarrowing);
        short shortNarrowing = (short) intNarrowing;             // Explicit Narrowing from int to short - Loss of data
        System.out.println("Narrowing short " + shortNarrowing);
        byte byteNarrowing = (byte) shortNarrowing;              // Explicit Narrowing from int to short - Loss of data
        System.out.println("Narrowing Byte " + byteNarrowing);


        //Scenario -1 :  A payment gateway generates transaction IDs as long, but your method expects a double.
        System.out.println("-----Scenarios------------");
            long txnId = 9876543210123456L;
            double doubleTxnId = txnId;  // Implicit Widening (meaning automatically converted from long to double
            txnId = (long) doubleTxnId;  /* Explicit Typecasting (narrowing) (meaning - programmer explicitly
                                            converted double to long, this may result in loss of data and precision.*/
            System.out.println(doubleTxnId);
            System.out.println(txnId);


        //Scenario - 2 : Product quantity is int, price is double.
        // If widening doesn’t happen automatically, multiplication might use integer arithmetic.

            int quantity = 25;
            double price = 101.25;

            double totalAmount = quantity * price; // Implicit Widening of int (quantity) to double;


    }

}

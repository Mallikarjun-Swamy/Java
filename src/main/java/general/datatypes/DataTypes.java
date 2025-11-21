package general.datatypes;

public class DataTypes {



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

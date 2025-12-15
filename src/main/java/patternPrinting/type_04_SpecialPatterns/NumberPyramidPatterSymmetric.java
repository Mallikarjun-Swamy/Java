package patternPrinting.type_04_SpecialPatterns;

public class NumberPyramidPatterSymmetric {

    public static void main(String[] args) {
        //printNumberPyramidSymmetric_1(6);
        printNumberPyramidSymmetric_2(3);
    }


    //type 1 - using maths
    static void  printNumberPyramidSymmetric_1(int input){
        int increment = 1;

        for (int i = 1; i <= input ; i++) {
           for (int j = 1; j <= input - i; j++) {
               System.out.print(" " + " ");
           }

           for (int j = 1; j <= increment; j ++) {
               System.out.print(i+ " ");
           }

           increment += 2;
           System.out.println();
        }
    }

    //type 2 - using variables
    static void printNumberPyramidSymmetric_2(int input){

        int spaces = input - 1;
        int stars = 1;

        for (int i = 1; i <= input ; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
            spaces -= 1;
            stars += 2;
        }



    }
}

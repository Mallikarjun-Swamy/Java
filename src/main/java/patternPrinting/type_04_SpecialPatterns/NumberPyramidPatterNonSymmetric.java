package patternPrinting.type_04_SpecialPatterns;

public class NumberPyramidPatterNonSymmetric {

    public static void main(String[] args) {
        printNumberPyramidPatterNonSymmetric(6);
    }

    public static void printNumberPyramidPatterNonSymmetric(int input){

        for (int i = 1; i <= input ; i++) {
            for (int j = 1; j <= input - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }



}

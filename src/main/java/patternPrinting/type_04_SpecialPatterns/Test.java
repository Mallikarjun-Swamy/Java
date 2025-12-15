package patternPrinting.type_04_SpecialPatterns;

public class Test {

    public static void main(String[] args) {

        int input = 6;

        int spaces = input - 1;
        int stars = 1;

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= spaces ; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= stars ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();

            spaces -= 1;
            stars += 2;

        }

        spaces = 1;
        stars = 2 * input -3;

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= spaces ; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= stars ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();

            spaces += 1;
            stars -= 2;

        }

    }

}


class Temp {
    void triangles(int rows, int columns){
        //Type 1
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println("------------------");


        //Type 2
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (columns+1)-i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println("------------------");


        //Type 3
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= (columns+1)-i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println("------------------");

        //Type 4
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (columns+1)-i; j++) {
                System.out.print(" " + " ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println("------------------");
    }
}
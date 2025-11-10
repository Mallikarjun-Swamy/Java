package patternPrinting.type_03_Triangle_03;

public class Alphabets {

    public static void main(String[] args) {

        int n = 5;

        //Type-1
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }

        System.out.println("---------------------");

        //Type-2

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
    }

}

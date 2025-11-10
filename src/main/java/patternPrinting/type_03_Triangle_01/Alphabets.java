package patternPrinting.type_03_Triangle_01;

public class Alphabets {
    public static void main(String[] args) {
        int n = 4;
        // Type - 1 - Uppercase
        for (int i=1; i<=n; i++){
            for (int j = 1; j <=i ; j++) {
                System.out.print((char) (j+64) + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------");

        // Type - 2 - Uppercase
        for (int i=1; i<=n; i++){
            for (int j = 1; j <=i ; j++) {
                System.out.print((char) (i+64) + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------");

        // Type - 1 - LowerCase
        for (int i=1; i<=n; i++){
            for (int j = 1; j <=i ; j++) {
                System.out.print((char) (j+96) + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------");

        // Type - 2 - LowerCase
        for (int i=1; i<=n; i++){
            for (int j = 1; j <=i ; j++) {
                System.out.print((char) (i+96) + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------");

        // Type - 3 - Alternative Upper and Lowercase rows
        for (int i=1; i<=n; i++){
            for (int j = 1; j <=i ; j++) {
                if(i%2 == 1)
                    System.out.print((char) (j+64) + " ");
                else
                    System.out.print((char) (j+96) + " ");
            }
            System.out.println();
        }

    }
}

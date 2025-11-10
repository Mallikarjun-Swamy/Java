package patternPrinting.type_02_Square;

public class Alphabets {
    public static void main(String[] args) {
        int n = 4;

        //Type - 1  - UpperCase
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print((char) (j+64) + "  ");
            }
            System.out.println();
        }
        System.out.println("---------------------");

        //Type - 2 - UpperCase
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print((char) (i+64) + "  ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------");


        //Type - 1  - LowerCase
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print((char) (j+96) + "  ");
            }
            System.out.println();
        }
        System.out.println("---------------------");

        //Type - 2 - LowerCase
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print((char) (i+96) + "  ");
            }
            System.out.println();
        }
    }
}

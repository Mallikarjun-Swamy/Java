package patternPrinting.type_01_Rectangle;

public class Alphabets {
    public static void main(String[] args) {
        int m = 5;
        int n = 6;

        //Type - 1  - UpperCase
        for (int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                System.out.print((char) (j+64) + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------");

        //Type - 2 - UpperCase
        for (int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                System.out.print((char) (i+64) + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------");


        //Type - 1  - LowerCase
        for (int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                System.out.print((char) (j+96) + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------");

        //Type - 2 - LowerCase
        for (int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                System.out.print((char) (i+96) + " ");
            }
            System.out.println();
        }
    }
}

package patternPrinting.type_03_Triangle_03;

public class Numbers {

    public static void main(String[] args) {
        int n=4;

        //Type-1
        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <=n-i; j++) {
                System.out.print(" " + " ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }

            System.out.println();
        }

        System.out.println("---------------------");

        //Type-2
        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <=n-i; j++) {
                System.out.print(" " + " ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }

            System.out.println();
        }
    }
}

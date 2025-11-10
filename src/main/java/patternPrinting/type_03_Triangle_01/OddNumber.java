package patternPrinting.type_03_Triangle_01;

public class OddNumber {

    /*
    there are two ways,
    1.  (use (2*j)-1 to get odd number at each j value
    2. or temp variable inside first loop, increase it by 2, in inside second inner loop

     */

    public static void main(String[] args) {
        int n=5;

        //way - 1
        for (int i = 0; i <=n ; i++) {

            for (int j = 1; j <=i; j++) {
                System.out.print((2*j)-1 + " ");
            }
            System.out.println();
        }

        System.out.print("----------------------");
        //way - 2

        for (int i = 0; i <=n ; i++) {
            int temp=1;
            for (int j = 1; j <=i; j++) {
                System.out.print(temp + " ");
                temp +=2;
            }
            System.out.println();
        }
    }
}

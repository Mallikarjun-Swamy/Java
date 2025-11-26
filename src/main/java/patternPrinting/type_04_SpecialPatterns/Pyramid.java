package patternPrinting.type_04_SpecialPatterns;

public class Pyramid {
    public static void main(String[] args) {
        int n=5;

        System.out.println("--------------Approach - 1 (using Variables)--------------------");
        int spaces = n-1;
        int stars = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=spaces ; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*" + " ");
            }
            spaces -= 1;
            stars += 2;
            System.out.println();
        }

        System.out.println("----------------Approach - 2- Using Maths-----------------");

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" "+ " ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }


    }
}

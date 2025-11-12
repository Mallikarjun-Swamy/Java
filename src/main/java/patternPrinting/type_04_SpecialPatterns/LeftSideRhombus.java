package patternPrinting.type_04_SpecialPatterns;

public class LeftSideRhombus {
    public static void main(String[] args) {
        int n=5;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i-1 ; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <=n ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }


    }
}

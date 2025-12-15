package patternPrinting.type_04_SpecialPatterns;

public class DiamondPattern {
    public static void main(String[] args) {
        int input = 6;
        int spaces = input-1;
        int stars = 1;

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*" + " ");
            }
            spaces -= 1;
            stars += 2;
            System.out.println();
        }

        spaces = 1;
        stars = 2*input-3;

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <=spaces; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*" + " ");
            }
            spaces += 1;
            stars -= 2;
            System.out.println();
        }

    }
}

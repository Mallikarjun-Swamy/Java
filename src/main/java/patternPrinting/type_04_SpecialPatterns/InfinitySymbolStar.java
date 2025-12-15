package patternPrinting.type_04_SpecialPatterns;

public class InfinitySymbolStar {

    public static void main(String[] args) {
        int rows = 7; //if n is odd then its better
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows ; j++) {
                if (  j==1 || j==rows || i==j || i+j == rows+1) {
                    System.out.print("*" + " ");
                }else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}

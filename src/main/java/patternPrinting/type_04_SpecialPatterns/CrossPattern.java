package patternPrinting.type_04_SpecialPatterns;

public class CrossPattern {


    public static void main(String[] args) {
        //n should be odd
        int n=5;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if(i==j || i+j == (n+1)){
                    System.out.print("*"+ " ");
                }else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

}

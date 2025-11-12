package patternPrinting.type_03_Triangle_04;

public class UpsideDownTriangleTemplate {
    public static void main(String[] args) {
        String sc = "Hello";
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i-1; j++) {
                System.out.print(" " + " ");
            }

            for (int j = 1; j <= (n+1)-i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

}

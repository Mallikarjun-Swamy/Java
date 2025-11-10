package patternPrinting.type_01_Rectangle;

public class Numbers {
    public static void main(String[] args) {
        int m = 5;
        int n = 6;

        //Type - 1
        for (int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
        //Type - 2
        for (int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

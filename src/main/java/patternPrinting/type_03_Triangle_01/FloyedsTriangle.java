package patternPrinting.type_03_Triangle_01;

public class FloyedsTriangle {

    public static void main(String[] args) {

        int n=5;
        int temp=1;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(temp + " ");
                temp++;
            }

            System.out.println();
        }


    }

}

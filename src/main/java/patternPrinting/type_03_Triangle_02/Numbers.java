package patternPrinting.type_03_Triangle_02;

public class Numbers {

    public static void main(String[] args) {
        int n=5;
        //Type - 1
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=(n+1)-i ; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        System.out.println("----------------");
        //Type - 2
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=(n+1)-i ; j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }

        System.out.println("----------------");
        //Type - 3
        int temp = 1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=(n+1)-i ; j++) {
                if(temp<10 )
                    System.out.print("0" +temp+ " ");
                else
                    System.out.print(temp+ " ");

                temp++;
            }
            System.out.println();
        }
    }

}

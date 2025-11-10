package patternPrinting.type_03_Triangle_01;

public class Test {
    public static void main(String[] args) {
        int end=5;
        int space=4;
        for(int i=1;i<=9;i++)
        {
            for(int j=1;j<=end;j++)
            { if(j<=space)
                System.out.print(" ");
                else
                System.out.print("*");
            }
            System.out.println();
            if(i<5){

            space--;}
            else {
                space++;
            }

        }
    }
}

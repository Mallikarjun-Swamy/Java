package patternPrinting.type_04_SpecialPatterns;

public class Pyramid {

    public static void main(String[] args) {
        int rows = 3;
        int numOfSpaces = rows - 1;
        int numOfStars = 1;

        for (int i=1; i<=rows; i++){
            for (int j=1; j<=numOfSpaces; j++){
                System.out.print(" " + " ");
            }

            for (int j = 1; j <=numOfStars ; j++) {
                System.out.print("*" + " ");

            }

            System.out.println();
            numOfSpaces--;
            numOfStars += 2;
        }

        numOfSpaces = 1;
        numOfStars = 2*rows-3;

        for (int i=1; i<=rows; i++){
            for (int j=1; j<=numOfSpaces; j++){
                System.out.print(" " + " ");
            }

            for (int j = 1; j <=numOfStars ; j++) {
                System.out.print("*" + " ");

            }

            System.out.println();
            numOfSpaces++;
            numOfStars -= 2;
        }

    }


}

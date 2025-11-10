package assesments.onNov9th2025;

public class ReverseNumber {

    public static void main(String[] args) {
        int givenNumber = 12345;
        int temp = givenNumber;
        String number = "";

        while (givenNumber>0){
            number += givenNumber%10;
            givenNumber =  givenNumber/10;
        }

        System.out.printf("The Reverse of %d is %s",temp, number );
    }

}

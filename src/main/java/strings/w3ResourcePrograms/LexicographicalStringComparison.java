package strings.w3ResourcePrograms;

import java.util.Scanner;

public class LexicographicalStringComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First sentence : ");
        String firstString = scanner.nextLine();
        System.out.print("Enter Second sentence : ");
        String secondtString = scanner.nextLine();
        String answer = returnAnswer(scanner);
        lexicographicalComparision(firstString,secondtString,answer);
    }

    //Static Method to take user Answer
    public static String returnAnswer(Scanner scanner){
        System.out.print("Want to compare with Case-Sensitivity? (Enter Yes or No) : ");
        String answer = scanner.next();
        return  answer;
    }

    //Static Method to Print Compassion Result
    public static void lexicographicalComparision(String firstString, String secondtString, String answer){
        if(answer.equalsIgnoreCase("yes") ||answer.equalsIgnoreCase("y") ){
            System.out.println("----This is Case Sensitive Comparison------");
            if(firstString.compareTo(secondtString)>0){
                System.out.println(" Lexicographically, "+firstString+ " > (greater than) " + secondtString);
            }else if(firstString.compareTo(secondtString)==0){
                System.out.println(" Lexicographically, "+secondtString+ " == (equal to) " + firstString);
            }else {
                System.out.println(" Lexicographically, "+secondtString+ " > (greater than) " + firstString);
            }
        }else if(answer.equalsIgnoreCase("no") ||answer.equalsIgnoreCase("n")){
            System.out.println("----This is Case-insensitive Comparison-----");
            if(firstString.compareToIgnoreCase(secondtString)>0){
                System.out.println(" Lexicographically, "+firstString+ " > (greater than) " + secondtString);
            }else if(firstString.compareToIgnoreCase(secondtString)==0){
                System.out.println(" Lexicographically, "+secondtString+ " == (equal to) " + firstString);
            }else {
                System.out.println(" Lexicographically, "+secondtString+ " > (greater than) " + firstString);
            }
        }else {
            System.out.println("please enter a valid response");
            String newResponse = returnAnswer(new Scanner(System.in));
            lexicographicalComparision(firstString,secondtString,newResponse);
        }
    }
}

package strings.w3ResourcePrograms;

import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sentence/word you want to revere : ");
        String response = scanner.nextLine();

        String reverse = printInReverse(response);
        System.out.println("reverse of \"" + response + "\" is \""+ reverse + "\"");
    }

    public  static String printInReverse(String res){
        String result = "";

        for (int i = res.length()-1; i>=0; i--){
            result += res.charAt(i);
        }

        return result;
    }

}

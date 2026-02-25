package general.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MobileNumberValidator {

    // Method for Indian Mobile Number Validation
    public static boolean isValidIndianMobileNumber(String input) {
        // Matches: +91 9876543210, 919876543210, 09876543210, 9876543210
        String regex = "^(\\+91|91|0)?\\s?[6-9][0-9]{9}$";  
        return Pattern.matches(regex, input);
    }

    // Method for US Mobile Number Validation
    public static boolean isValidUSMobileNumber(String input) {
        // Matches: (123) 456-7890, 123-456-7890, 1234567890, +1 123 456 7890
        String regex = "^(?:\\+?1[-. ]?)?\\(?([2-9][0-8][0-9])\\)?[-. ]?([2-9][0-9]{2})[-. ]?([0-9]{4})$";
        return Pattern.matches(regex, input);
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);           
         System.out.print("Enter Indian Mobile Number: ");
         //System.out.print("Enter US Mobile Number: ");
         String input = sc.nextLine().trim();

         /// 1.Mobile Number Verifier
        if (isValidIndianMobileNumber(input)) { // change the method accordingly 
            System.out.println("Valid Mobile Number");
        } else {
            System.out.println("Invalid Format");
        }
        
        sc.close();

    }
}

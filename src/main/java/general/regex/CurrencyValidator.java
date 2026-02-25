import java.util.Scanner;
import java.util.regex.Pattern;

public class CurrencyValidator {

    public static boolean isValidCurrency(String input) {
        // Breakdown:
        // ^([$₹]|Rs\.?)?  -> Optional Symbol ($, ₹, or Rs.)
        // \s?             -> Optional space
        // \d+             -> One or more digits (No commas allowed here)
        // (\.\d{2})?      -> Optional decimal point followed by exactly 2 digits
        // $               -> End of string
        String basicRegex = "^([$₹]|Rs\\.?)?\\s?\\d+(\\.\\d{2})?$";
        
        return Pattern.matches(basicRegex, input);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        System.out.print("Enter amount (e.g., $100 or 50.75): ");
        String input = sc.nextLine();

        if (isValidCurrency(input)) {
            System.out.println("Valid Format");
        } else {
            System.out.println("Invalid Format (Don't use commas)");
        }
        
        sc.close();
    }
}

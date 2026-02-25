import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidator {

    public static boolean isValidEmail(String email) {
        //  Alphanumeric local part, @ symbol, domain name, and 2+ char TLD
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return Pattern.matches(emailRegex, email);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Email Address: ");
        String email = sc.nextLine();

        if (isValidEmail(email)) {
            System.out.println("Valid Email Format");
        } else {
            System.out.println("Invalid Email (Ensure it has @ and a valid domain like .com)");
        }
    }
}

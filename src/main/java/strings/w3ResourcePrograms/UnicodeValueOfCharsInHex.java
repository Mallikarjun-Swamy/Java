package strings.w3ResourcePrograms;

public class UnicodeValueOfCharsInHex {

    public static void main(String[] args) {

        String singleChar = "M";
        String emoji = "😃";

        int unicodeValue = singleChar.codePointAt(0);
        int emojiUnicodeValue  = emoji.codePointAt(0);

        System.out.println("Unicode Decimal value of " + singleChar + " is " + unicodeValue );
        System.out.printf("Unicode Hex value of " + singleChar + " is U+%X%n" , unicodeValue);

        System.out.println("Unicode Decimal value of " + emoji + " is " + emojiUnicodeValue );
        System.out.printf("Unicode Hex value of " + emoji + " is U+%X%n" , emojiUnicodeValue);

    }

}

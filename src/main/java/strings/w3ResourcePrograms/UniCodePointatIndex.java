package strings.w3ResourcePrograms;

public class UniCodePointatIndex {

    public static void main(String[] args) {

        String originalString = "Java is fun 😀";

        System.out.println("Original String is - "+ originalString);

        int firstCharCode = originalString.codePointAt(0);
        int lastCharCode = originalString.codePointBefore(originalString.length());
        int randomCharCode = originalString.codePointAt(2);

        System.out.println("First Char Code Point (at index 0) is - " + firstCharCode);
        System.out.println("Last Char Code Point (at last index) - " + lastCharCode);
        System.out.println("Code point of char at index 2 is - " + randomCharCode);

    }
}

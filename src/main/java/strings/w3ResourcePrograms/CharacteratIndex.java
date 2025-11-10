package strings.w3ResourcePrograms;

public class CharacteratIndex {

    public static void main(String[] args) {

        String originalString = "Java Exercises!";

        char firstChar = originalString.charAt(0);
        char randomChar = originalString.charAt(5);
        char lastChar = originalString.charAt(originalString.length()-1);

        System.out.println("original String" + originalString);
        System.out.println("Char at index 0 is " + firstChar);
        System.out.println("Char at last index is "+ lastChar);
        System.out.println("char at index 5 is " + randomChar);

    }

}

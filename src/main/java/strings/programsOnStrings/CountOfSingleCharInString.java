package strings.programsOnStrings;

public class CountOfSingleCharInString {

    public static void main(String[] args) {
        String text = "Banana";
        char ch = 'a';
        int count = getCountOfCharInString(text, ch);
        System.out.println("count of " + ch + " in " + text + " is " + count);
    }

    public static int getCountOfCharInString(String text, char ch) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }

}

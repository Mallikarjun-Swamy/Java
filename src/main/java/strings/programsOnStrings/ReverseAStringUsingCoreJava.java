package strings.programsOnStrings;

public class ReverseAStringUsingCoreJava {

    public static void main(String[] args) {

        String text = "Java";
        System.out.println("Original String is " + text);

        //Method - 1 - Using CharAt(), for loop and Concatenation
        System.out.println("Reversed String is (method 1) " + reverseStringMethod1(text));

        //Method - 2 - Using Char Array, for loop and Concatenation
        System.out.println("Reversed String is (method 2) " + reverseStringMethod2(text));

        //Method - 3 - Using Char Array and Swap technique (while loop)
        System.out.println("Reversed String is (method 3) " + reverseStringMethod3(text));

        //Method - 4 - Using Method recursion
        System.out.println("Reversed String is (method 4) " + reverseStringMethod4(text));

        //Method - 5 - Using Char Array, for loop and Manual Building
        System.out.println("Reversed String is (method 5) " + reverseStringMethod5(text));

    }


    //Method - 1 - Using CharAt() and for loop
    public static String reverseStringMethod1 (String text){

        String reversed = "";

        for (int i = text.length()-1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        return reversed;

    }


    //Method - 2 - Using Char Array anf for loop
    public static String reverseStringMethod2 (String text){
        char[] charArray = text.toCharArray();
        String reversed = "";

        for (int i = charArray.length - 1; i >= 0; i--) {
            reversed = reversed + charArray[i];
        }

        return reversed;
    }


    //Method - 3 - Using Char Array and Swap technique
    public static String reverseStringMethod3 (String text){
        char[] charArray = text.toCharArray();
        String reversed = "";

        int left = 0;
        int right = charArray.length - 1;

        while (left<right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        reversed = new String(charArray);

        return reversed;
    }

    //Method - 4 - Using recursion
    public static String reverseStringMethod4 (String text){
        if(text == null || text.length() <= 1){
            return text;
        }
        String remaining = text.substring(1);
        String reversedRemaining = reverseStringMethod4(remaining);
        char firstChar = text.charAt(0);
        String result = reversedRemaining + firstChar;
        return result;
    }

    //Method - 5 - Using Character Array & Manual Building

    public static String reverseStringMethod5 (String text){
        char[] charArray = text.toCharArray();
        char[] reversed = new char[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            reversed[i] = charArray[(charArray.length-1) - i];
        }

        return new String(reversed);
    }
}

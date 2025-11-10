package strings.programsOnStrings;

public class CountCharsInAString {

    public static void main(String[] args) {
        String text = "Banana";
        printCountOfEachCharInString1(text);
        System.out.println("----------------------------");
        printCountOfEachCharInString2(text);
    }



    //Method - 1, Using ASCII Values
    public static void printCountOfEachCharInString1 (String text){
        // here text = passed value
        int[] countArray = new int[256];

        /* Since each element in countArray is set 0 by default, and there index goes from 0 to 255;
           so, increase count of repeated chars, by passing each chars respective ASCII Value
           example: charArray[B] means charArray[66], so initially charArray[66] values is 0,
           and then charArray[66]++  makes 1 increment (0+1), for each occurrence again.
        */

        for (int i = 0; i < text.length(); i++) {
            countArray[text.charAt(i)]++;         // charAt returns each char from text, then it is promoted to respective ASCII int Value
        }

        // Print the number of occurrence of each char
        for (int i = 0; i < countArray.length; i++) {
            if(countArray[i]>0){
                System.out.println((char) i + " -> " + countArray[i] + " times");
            }
        }
    }

    //Method - 2, By Using for double for loop and flag,

    public static void printCountOfEachCharInString2 (String text) {

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            int count = 0;
            boolean isrepeatedChar = false;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) { //checks weather the current char already counted, if true update flag
                    isrepeatedChar = true;
                    break;
                }
            }
            if (isrepeatedChar) continue; //skips the current iteration if true

            for (int k = 0; k < text.length(); k++) {
                if (text.charAt(k) == current) {
                    count++;
                }
            }

            System.out.println(current + " -> " + count + " times");
        }

    }

}

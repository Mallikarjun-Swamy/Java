package strings.methodsOfStringClass;

import java.util.Arrays;

public class Split {

    //split() -
    //The split() method divides a string into multiple substrings
    // based on a given delimiter (pattern), and returns them as a String array.

    // It returns an array of strings (e.g., String[]) containing substrings split based on the delimiter.

    //Signatures
    //public String[] split(String regex)
    //public String[] split(String regex, int limit)

    public static void main(String[] args) {
        String text = "apple,banana,grape";
        String[] fruits = text.split(",");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        //Example — Limit in Action

        String alpha = "A,B,C,D,";

        System.out.println(Arrays.toString(alpha.split(",", 2)));     // [A, B,C,D,] → Split only once

        System.out.println(Arrays.toString(alpha.split(",", 0)));    // [A, B, C, D] → All parts, trailing empties removed

        System.out.println(Arrays.toString(alpha.split(",", -1)));   // [A, B, C, ""] → Keeps trailing empty string



        //---------------------------------------------------------------
        //Real-World Examples
        // 1 — Parsing CSV Data

        String line = "101,Mallikarjun,Developer,55000";
        String[] fields = line.split(",");

        System.out.println("ID: " + fields[0]);
        System.out.println("Name: " + fields[1]);
        System.out.println("Role: " + fields[2]);
        System.out.println("Salary: " + fields[3]);
    }



}

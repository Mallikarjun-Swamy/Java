package strings.methodsOfStringClass;

public class CompareToAndcompareToIgnoreCase {

    // compareTo(String str) Method (Case Sensitive)
    // This method compares two strings lexicographically (dictionary order).
    // This means it will compare characters based on ASCII Values/Unicode,
    // It compares characters one by one using their Unicode values until a mismatch is found or end is reached. Used in sorting algorithms.
    // Returns 0 if both strings are equal
    // Returns +ve integer if current string is greater
    // Returns -ve integer if current string is smaller


    //compareToIgnoreCase(String str) Method (Case in-Sensitive)
    //This method compares two strings lexicographically but, case is ignore,
    // that means Lowercase and Uppercase characters are same.
    // It compares characters one by one using their Unicode values until a mismatch is found or end
    // Returns 0 if both strings are equal
    // Returns +ve integer if current string is greater
    // Returns -ve integer if current string is smaller


    public static void main(String[] args) {

        String name1 = "Alice";
        String name2 = "Bob";

        System.out.println(name1.compareTo(name2)); //-1 (beacuse B comes after A)

        if(name1.compareTo(name2)<0){
            System.out.println(name1 + " comes before " + name2);
        }

        //----------------------------------------------------------------------

        String user1 = "Admin";
        String user2 = "admin";
        System.out.println(user1.compareToIgnoreCase(user2)); //0

    }

}

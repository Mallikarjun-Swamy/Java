package patternPrinting.type_03_Triangle_02;

public class HoriFlippedRightAngleTriangle {

    /*
    Rules.
    n = is number of rows and columns as well
    i = outer loop iterator
    j = inner loop iterator

    1. Outer loops acts as number of rows to be printed (n)
    2. Inner loop, acts as number elements to be printed in each row, and it
    should go from j (inner loop variable) to (n+1)-i (outer loop variable),
    so limiting the inner loop, value as of outer loop, this creates a right angle Tringle

    3. In the inner loop, we can change the element to be printed accordingly.
            for example:
               1. if want print *, use star in print statement
               2. if you want increasing number in the same row then use j (inner loop variable)
               3. if you want same number in a row, but increment in next row use i (outer loop variable)
               4. if you want Uppercase alphabets:
                    use j+64 for incremental in a row or i+64 and
                    if you want same alpha in a row, but increment in next row
               5. if you want lowercase alphabets:
                    use j+96 for incremental in a row or
                    i+96 for if you want same alpha in a row, but increment in next row


     */

    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=(n+1)-i ; j++) {
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}

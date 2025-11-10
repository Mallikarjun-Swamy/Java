package arrays;

public class SumOfArray {
    public static void printSumOfArray(int[] sumArray) {

        int sum=0;

        for (int i=0; i<sumArray.length; i++){
            sum += sumArray[i];
        }

        System.out.println("sum of array is : "+ sum);

    }

}

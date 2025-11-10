package assesments.onNov9th2025;

public class ArrayProblems {

    public static void main(String[] args) {
        int[] arr= { 1,5,1, 8, 10, 36, 25,2, 5};
        //int[] arr= { 5,5,5};

        int largestElement = getLargestElement(arr);
        System.out.println("Largest Element is -> " + largestElement);

        int secondLargest = getSecondLargestElement(arr);
        System.out.println("Second Largest Element is->" + secondLargest );

        int arraySum = getArraySum(arr);
        System.out.println("Array Sum is -> " + arraySum);

        double arrayAvg = arraySum/(double) (arr.length);
        System.out.println("Array Avg is -> " + arrayAvg);

    }

    public static int getLargestElement(int[] arr){
        int largeEle = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largeEle){
                largeEle = arr[i];
            }

        }

        return largeEle;
    }

    public static int getSecondLargestElement(int[] arr){
        int largeEle = arr[0];
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largeEle){
                largeEle = arr[i];
            }

        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>second && arr[i] != largeEle){
                second = arr[i];
            }

        }

        return second;
    }


    public static int getArraySum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}

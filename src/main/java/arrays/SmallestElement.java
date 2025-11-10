package arrays;

public class SmallestElement {
    public static void printSmallestElement (int[] arr) {

        int small = arr[0];
        int index = -1;

        for (int i=0; i<arr.length; i++){
            if (arr[i]<small){
                small = arr[i];
                index = i;
            }
        }
        System.out.println("The smallest element is "+ small + " and it's index in the array is "+ index);
    }
}

package arrays;

public class LargestElement {
    public static void printLargetsElement (int[] arr) {
        int max = arr[0];
        int index = 0;

        for (int i=0; i< arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
        }

        System.out.println("The max element is " + max + " and  it's index in array is "+ index);

    }


}

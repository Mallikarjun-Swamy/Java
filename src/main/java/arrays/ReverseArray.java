package arrays;

public class ReverseArray {

    public static void reverseArray(int[] arr) {

        int i = 0;
        int j = arr.length-1;
        System.out.print("Before Reverse : ");
        for (int ele : arr) System.out.print(+ele +" ");
        System.out.println();

        //method one using while loop
//        while (i<j){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }

        //method 2 using while loop
        for (; i< arr.length && j>i; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.print("After Reverse : ");
        for (int ele : arr) System.out.print(ele+" ");

    }
}

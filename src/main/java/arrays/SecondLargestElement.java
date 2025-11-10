package arrays;

public class SecondLargestElement {

        public static void  secondLargestElement(int[] arr){
            int max = arr[0];
            int smax = Integer.MIN_VALUE;

            for (int i = 0; i< arr.length; i++){
                if (arr[i]>max) {
                    max = arr[i];
                }
            }

            for (int i=0; i<arr.length; i++){
                if (arr[i]>smax && arr[i] != max){
                    smax = arr[i];
                }
            }

            if (smax == Integer.MIN_VALUE){
                System.out.println(" No second max element exist (all elements are equal)");
            }else {
                System.out.println("Largest element is " + max);
                System.out.println("The second largest element is " + smax);
            }


        }
}

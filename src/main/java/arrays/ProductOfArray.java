package arrays;

public class ProductOfArray {

    public static void printProductOfArray (int[] arr){
        long product = 1;

        //using traditional for loop
        for (int i=0; i<arr.length; i++){
            product *= arr[i];
        }

          //using for each loop
//        for (int element : arr){
//            product *= arr[element];
//        }

        System.out.print("product of the array is : " + product);

    }

    //add 2 to odd indexed elements and multiply 10 to even indexed elements
    public static void printNewArray(int[] arr){

        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i=0; i<arr.length; i++){
            if (i%2 == 0) arr[i] += 10;
            else arr[i] *= 2;
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }


}

package arrays;


public class TwoSum {

    //this code works, but not optimized
    public static void twoSum (int[] arr, int target) {
        boolean flag = false;
        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j<arr.length;j++){
                if (arr[i]+arr[j] == target){
                    System.out.println("Sum possible for "+ target + " and element are : " + arr[i] + " and " + arr[j]);
                    flag = true;
                }
            }
        }
        if (!flag) System.out.println("Two elements not found for the given target");
    }
}

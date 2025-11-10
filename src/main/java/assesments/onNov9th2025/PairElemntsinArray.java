package assesments.onNov9th2025;

public class PairElemntsinArray {
    public static void main(String[] args) {
        int target = 10;
        int[] arr = { 1,2,4,5,8};
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

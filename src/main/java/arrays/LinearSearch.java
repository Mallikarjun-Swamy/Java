package arrays;

public class LinearSearch {

public static void returnTargetElementIndex(int[] arr, int target){

    int index = -1;
    boolean found = false;

    for (int i=0; i<arr.length; i++){
        if (target == arr[i]) {
            found = true;
            index = i;
            break; //this is used when if duplicate elements exist in the array but loop should break at first match  element,
        }
    }

    if (found) System.out.println("Element exist and it's index is : " + index);
    else System.out.println("Element does not exist");
}

}

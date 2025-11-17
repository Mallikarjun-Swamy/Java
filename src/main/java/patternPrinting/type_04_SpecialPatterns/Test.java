package patternPrinting.type_04_SpecialPatterns;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3,4,5};
        int[] array2 = {4, 5, 6,7,8};
        int[] array3 = {9, 10, 11,12,13};

        int totalSize = array1.length+array2.length+array3.length;
        int[] array4 = new int[totalSize];

        int array4Elements = 0;

        for (int i = 0; i < array1.length; i++) {
            array4[i] = array1[i];
            array4Elements++;
        }

        for (int i = 0; i < array2.length; i++) {
            array4[array4Elements++] = array2[i];
        }

        for (int i = 0; i < array3.length; i++) {
            array4[array4Elements++] = array3[i];
        }

        int[] array5 = new int[totalSize];
        int arra5length =0;

        for (int i = 0; i < array4.length; i++) {
            int count = 0;
            for (int j = 0; j <array4.length ; j++) {
                if (array4[i] == array4[j]){
                    count++;
                }
            }

            if(count == 1 ){
                array5[arra5length++] = array4[i];
            }
        }

//        System.out.print("[");
//        for (int i = 0; i < arra5length; i++) {
//            System.out.print(array5[i] + " ");
//        }
//        System.out.print("]");

        System.out.println(Arrays.toString(array5));
    }
}

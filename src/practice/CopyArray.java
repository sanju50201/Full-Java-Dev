package practice;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr = {1,2,34,5};
        int[] arr2 = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr2[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}

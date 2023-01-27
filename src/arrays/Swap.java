package arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,8,9,11};
//        swap(arr, 0,5);
//        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
//    reverse an array

//    this approach is called as two-pointer approach

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
//            swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}

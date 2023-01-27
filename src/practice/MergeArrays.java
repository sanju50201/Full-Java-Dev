package practice;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,34};
        int[] arr2 = {5,6,34};

        int[] merged = new int[arr1.length + arr2.length];

//        copy the first elements in the array
        for(int i=0;i<arr1.length;i++){
            merged[i] = arr1[i];
        }
//        copy the second elements in the array
        for(int  i =0,j=arr1.length; j<(arr1.length+arr2.length);j++,i++){
            merged[j] = arr2[i];
        }

//        Displaying the arrays:
        System.out.println("Array 1: "+ Arrays.toString(arr1));
        System.out.println("Array 2: "+Arrays.toString(arr2));
        System.out.println("Array 3: "+Arrays.toString(merged));
    }
}

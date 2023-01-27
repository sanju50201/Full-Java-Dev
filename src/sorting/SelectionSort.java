package sorting;

import java.util.Arrays;

public class SelectionSort {
//    public static void selectionSort(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
////            find the max item in the remaining array, and swap with correct index
//            int lastIndex = arr.length - i -1;
//            int maxIndex = getMaxIndex(arr, 0, lastIndex);
//
//            swap(arr, maxIndex, lastIndex);
//        }
//    }
//
//    static void swap(int[] arr, int first, int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//
//    private static int getMaxIndex(int[] arr, int start, int lastIndex) {
//        int max = start;
//        for (int i = start; i <= lastIndex; i++) {
//            if(arr[max] < arr[i]){
//                max = i;
//            }
//        }
//        return max;
//    }
    public static void selectionSort(int[] arr){
//        one by one move boundary of unsorted array
        for(int i = 0; i < arr.length - 1; i++){
//            find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            // swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,1,4,2,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

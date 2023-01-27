package searching.linearSearch;

public class MaxTwoDArray {

    public static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
//        for (int[] ints : arr) {
//            for (int anInt : ints) {
//                if (anInt > max) {
//                    max = anInt;
//                }
//            }
//        }
        return max;
    }

    public static int min(int[][] arr){
        int min = Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] < min){
                    min = arr[row][col];
                }
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[][] = {
                {45,2,21,34,43},
                {23,32,12,34,122},
                {213,33}
        };
        int maxValue = max(arr);
        System.out.println("The max value is: "+ maxValue);
        int minValue= min(arr);
        System.out.println("The min value is: "+minValue);
    }
}

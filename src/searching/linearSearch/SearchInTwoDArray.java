package searching.linearSearch;

import java.util.Arrays;

public class SearchInTwoDArray {
    public static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] arr = {
                {23,41,21},
                {43,5,31,9},
                {56,33,17,56},
                {18,12}
        };

        int target = 13;
        int[] ans = search(arr,target); // format will be return value {row, col}
        System.out.println(Arrays.toString(ans));
    }
}

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
//    Multi Dimensional Arrays => int[i][j]

         /*
//         the below is a matrix, which is a multi dimensional Array
            1 2 3
            4 5 6
            7 8 9
          */

//        adding the size of the row is mandatory, whereas the col size doesn't matter
//        int[][] arr = new int[3][];
        Scanner input = new Scanner(System.in);
//        int[][] arr = {
//                {1,2,3}, // 0th index
//                {4,5}, // 1st index
//                {6,7,8,9}, // 2nd index
//        };

        int[][] arr = new int[3][3];
//        System.out.println(arr.length); --> will return the length of the row.
//        input
            for(int row=0;row< arr.length;row++){
//                for every col take input in a row
                for(int col=0;col < arr[row].length;col++){
                    arr[row][col] = input.nextInt();
                 }
            }

//            output
//                for(int row =0; row <arr.length;row++){
//                    for(int col =0; col<arr[row].length;col++){
//                        System.out.print(arr[row][col] + " ");
//                    }
//                        System.out.println();
//                }
//        classic for loop
                for(int row=0;row<arr.length;row++){
                    System.out.println(Arrays.toString(arr[row]));
                }

//                enhanced for loop:
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}

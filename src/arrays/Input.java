package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

//        Array of primitives
/*
        for(int i=0;i<arr.length;i++){
            arr[i] = i+1; // prints array from 1 to n
        }
        System.out.println(arr[2]);*/
//        taking input from the user
//        for(int i=0;i<arr.length;i++){
//            arr[i] = in.nextInt();
//        }
//
////        printing tha taken input
////        for(int i=0;i<arr.length;i++){
////            System.out.print(arr[i] + " ");
////        }
//
////        instead of classic for loop we can use for-each in arrays
//
//        for(int num: arr){ // for every element in array, print the elements
//            System.out.print(num + " "); // here num represents elements of the array
//        }

//        Array of objects
        String[] str = new String[4];
        for(int i=0;i<str.length;i++){
            str[i] = in.next();
        }
//        for(var strings: str){
//            System.out.print(strings + " ");
//        }
        str[1] = "Hello!";
        System.out.println(Arrays.toString(str));
    }
}


package arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        syntax:
//        datatype[] variable_name = new datatype[size];

        int[] rollNos = new int[5];
        rollNos[0] = 21;
        rollNos[1] = 22;
        rollNos[2] = 23;
        rollNos[3] = 24;
        rollNos[4] = 25;
//        rollNos[5] = 26; throws an error, because the range is only 5
        System.out.println(Arrays.toString(rollNos));
//        Arrays in Java are not dynamic, the datatype should be same
        int[] rollnos = {11,23,45,51,78};
        System.out.println(Arrays.toString(rollnos));
        int[] ros; // declaration of array, ros is getting defined in the stack
        ros = new int[4]; // here the object is getting created in the memory(heap)
//        if there are no values initilazied, it takes 0 in its index
        System.out.println(ros[1]);

//        Arrays can be created in this way as well
        int[] nums = {1,2,3,54,5};
        System.out.println(Arrays.toString(nums));


        String[] arr = new String[4];
        System.out.println(Arrays.toString(arr)); // returns null

//         null is confined to String
        String str = null;
//        int n1 = null; => throws an error

        /*
        * In Java Primitive data types are stored in Stack memory
        * Strings, objects Etc are stored in Heap.
        * */


    }

}

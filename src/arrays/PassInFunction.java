package arrays;

import java.util.Arrays;

public class PassInFunction {

//    Strings are immutable, whereas arrays are mutable
    static void change(int[] arr){
        arr[0] = 99;
    }
    public static void main(String[] args) {
        int[] nums = {2,4,3,6,32};
        System.out.println("Before modification: "+Arrays.toString(nums));
        change(nums);
        System.out.println("After modification: "+Arrays.toString(nums));
    }
}

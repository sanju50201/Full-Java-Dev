package functions;

import java.util.Arrays;

public class ChangeValue {

    static void change(int[] nums){
        nums[0] = 99;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        change(arr);
        System.out.println(Arrays.toString(arr));
//        here we the value is updated because, it is pointing towards the same object
    }
}

package practice;

import java.util.Arrays;

public class ShuffleArray {
    public static int[] shuffleArray(int[] nums, int n){
        int[] ans = new int[2 * n];
        for (int i = 0; i < n;i++) {
                ans[2 * i] = nums[i];
                ans[2 * i + 1] = nums[i +  n];
        }
        return ans;
    }
    public static void main(String[] args) {

        int[] arr = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffleArray(arr,3)));

    }
}

/*
 *This solution uses a for loop to iterate through the first half of the input array
 *  and assigns the values to the even indices of the result array. Then it assigns the
 *  values from the second half of the input array to the odd indices of the result array.
 * This effectively shuffles the elements of the input array into the desired order.
 *  Time complexity of this solution is O(n) and space complexity is O(n) as well.
 *  */
/*
* You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.



Example 1:

Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.
Example 2:

Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no unique elements, and the sum is 0.
Example 3:

Input: nums = [1,2,3,4,5]
Output: 15
Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.


Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
* */

package practice;

public class SumUnique {
    public static int sumOfUnique(int[] nums) {
//        int result = 0;
//        int[] bitVector = new int[32];
//        for(int num: nums){
//                int pos = num/32 ;
//                int offset = num % 32;
//                bitVector[pos] ^= (1 << offset);
//        }
//        for(int i = 0; i < bitVector.length; i++){
//            for(int j = 0; j < 32; j++){
//                if((bitVector[i] & (1 << j)) != 0){
//                    result += i * 32 + j;
//                }
//            }
//        }
//        return result;

        Boolean[] dup = new Boolean[101];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (dup[nums[i]] == null) {
                dup[nums[i]] = true;
                sum += nums[i];
            } else if (dup[nums[i]] == true) {
                dup[nums[i]] = false;
                sum -= nums[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(sumOfUnique(arr));
    }
}

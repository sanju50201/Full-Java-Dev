/*
* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
* */

package practice;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

//    A function which uses Hash Map to find the two sum
    public static int[] twoSum(int[] nums,int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

//    a function which uses two point approach
        public static int[] twoSum2(int[] arr, int target){
        int[] indices = new int[2];
        int[] copy = arr.clone();
        Arrays.sort(copy);

        int left = 0, right = copy.length - 1;
        while(left < right){
            int sum = copy[left] + copy[right];
            if(sum == target){
                break;
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        int leftIdx = -1, rightIdx= -1;
        for(int i= 0; i<arr.length;i++){
            if(arr[i] == copy[left] && leftIdx == -1){
                leftIdx = i;
            }else if(arr[i] == copy[right]){
                rightIdx = i;
            }
            if(leftIdx != -1 && rightIdx != -1){
                break;
            }
        }
        indices[0] = leftIdx;
        indices[1] = rightIdx;
        return indices;

        }

    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8};
        System.out.println("Using HashMap: "+Arrays.toString(twoSum(arr,14)));

        System.out.println("Using two pointer: " + Arrays.toString(twoSum2(arr,7)));
    }
}

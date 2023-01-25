/*
* Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.



Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]


Constraints:

n == nums.length
1 <= n <= 105
1 <= nums[i] <= n
* */

package sorting.Questions;

import oop.interfaces.Main;

import java.util.ArrayList;
import java.util.List;

public class DisappearedInArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int index = 0;
        while(index < nums.length){
            if(nums[index] != nums[nums[index] - 1]){
                swap(nums, index, nums[index] - 1);
            }else{
                index++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for(index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                result.add(index+1);
            }
        }
        return result;
    }
    private static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
}


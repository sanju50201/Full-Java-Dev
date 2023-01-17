/*
* Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).



Example 1:

Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
Explanation: The array ans is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0,1,2,4,5,3]
Example 2:

Input: nums = [5,0,1,2,3,4]
Output: [4,5,0,1,2,3]
Explanation: The array ans is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
    = [4,5,0,1,2,3]


Constraints:

1 <= nums.length <= 1000
0 <= nums[i] < nums.length
The elements in nums are distinct.
* */


package practice;

import java.util.Arrays;

public class BuildArrayPermutation {

    /**
     * Given a zero-based permutation nums (0-indexed), build an array ans of the same length
     * where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
     *
     * @param nums a zero-based permutation array of distinct integers from 0 to nums.length - 1 (inclusive)
     * @return ans an array of the same length where ans[i] = nums[nums[i]]
     */

    public static int[] buildArray(int[] nums){
        int[] ans = new int[nums.length]; // create a new array of the same length as nums
        for(int i = 0; i < nums.length;i++){
            ans[i] = nums[nums[i]]; // for each i, set ans[i] = nums[nums[i]]
        }
        return ans; // returns the array
    }

    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(arr)));
    }
}

/*
* The code above defines a class called Solution which has a single method buildArray(int[] nums). The method takes in an array of integers called nums as input and returns an array of integers.

The method first creates a new array called ans of the same length as the input array nums. Then it iterates through the nums array using a for-loop, for each i the value of ans[i] is set to nums[nums[i]] this is the main logic of the problem. Finally, the method returns the ans array.

Overall the method takes an array of distinct integers and returns the array constructed using the following rule: ans[i] = nums[nums[i]] for each 0 <= i < nums.length

The time complexity of this solution is O(n) as it iterates through the array once, and the space complexity is O(n) as it creates a new array of the same size as the input array.
* */
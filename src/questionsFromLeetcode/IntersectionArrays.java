/*
* Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.



Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.


Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000
* */

package questionsFromLeetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionArrays {

//    this function has a time and space complexity of O(n) => because it requires n iterations

    public static int[] intersection(int[] nums1, int[] nums2) {
//        new set for the first array
        Set<Integer> set1 = new HashSet<>();

        // loop through it and add to the set
        for(int num : nums1){
            set1.add(num);
        }
//        the same thing here, but check if the set1 contains the num already, then add to the second set
        Set<Integer> set2 = new HashSet<>();
        for (int num:nums2) {
            if(set1.contains(num)){
                set2.add(num);
            }
        }
//        create a new array of size set2
        int[] result = new int[set2.size()];
        int i = 0; // initialize a counter as i=0
        for(int num: set2){
            result[i++] = num; // add the result, which increments to the num
        }
        // and return the result
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,3};
        System.out.println(Arrays.toString(intersection(arr1, arr2)));
    }
}

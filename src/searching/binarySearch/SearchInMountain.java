/*
* (This problem is an interactive problem.)

You may recall that an array arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.

You cannot access the mountain array directly. You may only access the array using a MountainArray interface:

MountainArray.get(k) returns the element of the array at index k (0-indexed).
MountainArray.length() returns the length of the array.
Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt to circumvent the judge will result in disqualification.



Example 1:

Input: array = [1,2,3,4,5,3,1], target = 3
Output: 2
Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
Example 2:

Input: array = [0,1,2,4,2,1], target = 3
Output: -1
Explanation: 3 does not exist in the array, so we return -1.


Constraints:

3 <= mountain_arr.length() <= 104
0 <= target <= 109
0 <= mountain_arr.get(index) <= 109
* */

package searching.binarySearch;

public class SearchInMountain {

    public static int search(int[] arr,int  target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = agnosticSearch(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
//            try to search in second half
            return agnosticSearch(arr,target,peak +1, arr.length-1);

    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid + 1]){
//                you are in decreasing part of array
//                this may be the answer, but look at left
//                this is why end != mid -1
                end = mid;
            }else{
                start = mid + 1; //because wkt mid + 1 element > mid element
            }
        }
//        in the end, start == end and pointing to the largest element in the array
//        start and end are always trying to find max element in the above 2 checks
//        hence, when they are pointing to just one element, that is the max one because that is what the check says
        return start;
    }
    public static int agnosticSearch(int[] arr, int target, int start, int end){


//        find whether the array is sorted in ascending or descending.
        boolean isAscending = arr[start] < arr[end];
//        if(arr[start] < arr[end]){
//            isAscending = true;
//        }else {
//            isAscending = false;
//        }

        while(start <= end){
//            find the mid
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAscending){
                if(target < arr[mid]){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        System.out.println(search(arr,4));
    }
}

package searching.binarySearch;

public class PeakInMountain {
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

    public static void main(String[] args) {
        int[] arr = {1,2,3,45,16,7,3};
        System.out.println(peakIndexInMountainArray(arr));
    }
}

package searching.binarySearch;

public class OrderAgnosticBinary {
    public static int agnosticSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

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
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int result = agnosticSearch(arr,18);
        System.out.println("The element is found at "+result+"th index.");
    }
}

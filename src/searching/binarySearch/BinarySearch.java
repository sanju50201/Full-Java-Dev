package searching.binarySearch;
public class BinarySearch {

//    return the index
//    return -1, if it doesn't exist
    public static int binarySearch(int[] arr, int target){
       int start = 0;
       int end = arr.length - 1;

       while(start <= end){
//           find the mid-element
           int mid = start + (end - start)/2;
           if(target < arr[mid]){
               end = mid -1;
           }else if(target > arr[mid]){
               start = mid + 1;
           }else {
               return mid;
           }
       }
//        target not found
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14};
        int result = binarySearch(arr,14);
        System.out.println("The element is at "+result+"th index.");
    }
}

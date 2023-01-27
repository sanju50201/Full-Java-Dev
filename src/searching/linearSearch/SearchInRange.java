package searching.linearSearch;

/*
* arr = [1,43,54,34,534,23,-23,32]
* search for 34 in the range of [1,4]
* */
public class SearchInRange {
    public static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int index =start; index<=end; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] arr = {34,-21,14,32,43,23,98};
        int ans = linearSearch(arr,43,2,5);
        System.out.println(ans);
    }
}

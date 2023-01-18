package searching.linearSearch;

public class LinearSearch {

//    iterate through the array, return the index if the element id found.
//    return -1, if the element is not found

    public static int linearSearch(int[] arr, int key){
       if(arr.length == 0){
           return -1;
       }

//       iterate through a for loop
        for (int index = 0; index < arr.length; index++) {
//            check for the element at every index if it is = target
            int element = arr[index];
            if(element == key){
                return index;
            }
        }
//        if the element is not found.
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {24,332,43,52,61,17,-12,32,21};
//        int[] arr2 = {};
        int ans = linearSearch(arr,32);
        System.out.println(ans);
    }
}
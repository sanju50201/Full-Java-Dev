package searching.linearSearch;

public class FindMax {
    public static int findMax(int[] arr){
        int max = arr[0]; // assume the zeroth index is maximum
        for (int i = 1; i < arr.length; i++) { // iterate through the array
            if(arr[i] >max){ // check, if the current element is greater than the max
                max = arr[i]; // update the max value
            }
        }
        return max; // return the max value
    }
    public static void main(String[] args) {
        int[] arr = {3,43,12,13,3,4,-21,145,23,2,31};
        int ans = findMax(arr);
        System.out.println(ans);
    }
}

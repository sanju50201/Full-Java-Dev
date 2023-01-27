package searching.linearSearch;

public class FindMin {
    public static int minNumber(int[] arr){
        int min = arr[0]; // assume min is the zeroth index
        for (int i = 1; i < arr.length; i++) { // iterate through the loop
            if(arr[i] < min){ // if current element is less than the min
                min = arr[i]; // update the value
            }
        }
        return min; // return the value
    }
    public static void main(String[] args) {
        int[] arr = {54,23,12,32,232,23};
        System.out.println(minNumber(arr));
    }
}

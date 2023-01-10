package practice;

public class LargestNum {
    static int maxNum(int[] arr){
//        assume max
        int max = arr[0];

//        traverse through the array
        for(int i=0; i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2112,34,23,32};
        System.out.println(maxNum(arr));
    }
}

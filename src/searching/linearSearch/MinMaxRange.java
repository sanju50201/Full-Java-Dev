package searching.linearSearch;

public class MinMaxRange {
    public static int minValue(int[] arr, int start, int end){
        int min = arr[0];
        for(int i = end;i<=end;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxValue(int[] arr, int start, int end){
        int max = arr[0];
        for(int i = start; i<= end;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {4,21,32,43,54,221,-21,32,-23,12};
        int min = minValue(arr,2,6);
        System.out.println("The minimum value is: "+min);
        int max = maxValue(arr,4,8);
        System.out.println("The maximum value is: "+max);
    }
}

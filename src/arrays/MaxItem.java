package arrays;

public class MaxItem {

    public static void main(String[] args) {
        int[] arr = {3,4,521,43,112,31};
        System.out.println(max(arr));
        System.out.println(maxInRange(arr,2,5));
    }
    static int max(int[] arr){
        int maxValue = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    static int maxInRange(int[] arr, int start, int last){

        if(last >start ){
            return -1;
        }
        if(arr == null){return -1;}
        int maxVal = arr[start];
        for(int i =start;i<last;i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

}

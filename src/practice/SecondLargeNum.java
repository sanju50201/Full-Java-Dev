package practice;


public class SecondLargeNum {

    static int larger(int[] arr){
        int fmax = arr[0];
        int smax = arr[0];

        for(int i=1;i<arr.length;i++){
            if(fmax < arr[i]){
                smax = fmax;
                fmax = arr[i];
            }else if(smax < arr[i]){
                smax = arr[i];
            }
        }
        return smax;
    }
    public static void main(String[] args) {
        int[] arr = {32,43,53423,4321,432};
        System.out.println("The second largest number is: "+ larger(arr));
    }
}

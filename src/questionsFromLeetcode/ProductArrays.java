package questionsFromLeetcode;

public class ProductArrays {
    static int prodArray(int[] arr){
        int product = 1;
        for(int i=0;i<arr.length;i++){
            product *= arr[i];
        }
        return product;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.print("The product of the given array is: "+prodArray(arr));
    }
}

package questionsFromLeetcode;

public class ArrayCompare {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = arr1;
        int[] arr3 = {3,4,5,6,7};
        if(arr1 == arr3){
            System.out.println("Both arrays are same");
        }else{
            System.out.println("Arrays are not equal");
        }
    }
}

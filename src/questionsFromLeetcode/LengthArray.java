package questionsFromLeetcode;

public class LengthArray {
    static int lengthArr(int[] arr){
        return arr.length;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,4,6,7};
        System.out.println("The length of the array is: "+lengthArr(arr));
    }
}

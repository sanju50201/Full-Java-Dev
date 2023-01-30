package questionsFromLeetcode;

public class AverageArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        int average = 0;
        for(int i=0;i< arr.length;i++){
            sum += arr[i];
        }
        average = sum/arr.length;
        System.out.println("The sum of the array is: "+sum);
        System.out.println("The Average of the array is: "+average);
    }
}

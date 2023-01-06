package basics;

import java.util.Scanner;

public class Problems {
    public static void main(String[] args) {
////        Print numbers which are even in an array
//        int[] arr = {1,2,4,3,5,6,7,8,9};
//        int[] evenArr;
//        for(int i=0;i<arr.length;i++){
//            if(i%2 == 0){
//                System.out.println("First Array: "+arr[i]);
//            }
//        }
//
////        print odd elements without using if
//        int[] arr1 = {1,2,3,4,5,6,7,8,9};
//        for(int i=0;i<arr1.length;i+=2){
//            System.out.println("Second Array: "+arr1[i]);
//        }

//        Print fibonacci numbers
        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int a =0;
//        int b = 1;
//        int count = 2;
//        while(count <=n){
//            int temp = b;
//            b +=a;
//            a =temp;
//            count++;
//        }
//        System.out.println(b);

//        recurring number
//        int num = 1385757879;
//        n % 10 gives us the last digit of a number
//        take input from the user
//        int count = 0;
//        while(num>0){
//            int remainder = num % 10;
//            if(remainder == 7){
//                count++;
//            }
//            num = num /10;
//        }
//        System.out.println("The count is "+count);

//        reverse of a number:

        int n = 23597;
        int result = 0;

        while(n>0){
            int rem = n % 10;
            n /= 10;
            result = result * 10 + rem;

        }
        System.out.println(result);
    }
}

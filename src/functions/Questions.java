package functions;

import java.util.Scanner;

public class Questions {
//    function to check the number is prime
    static boolean isPrime(int n){
        if(n <=1){
            return false;
        }
        int c = 2;
        while(c *c <= n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        if(c*c > n){
            return true;
        }
        return false;
    }

//    print the armstrong number
//     : the sum of a cubes the number is equal to the target number
//    i.e., 153 = 1^3 + 5^3 + 3^3

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            n = n/10;
            int cube = rem * rem * rem;
            sum += cube;
        }
//        if(sum == original){
//            return true;
//        }
//        return  false;
        return sum == original;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
//        System.out.println(isPrime(num));
//        System.out.println(isArmstrong(num));
        for(int i=100;i<=999;i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
}

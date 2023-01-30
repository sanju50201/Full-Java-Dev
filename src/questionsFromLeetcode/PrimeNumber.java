package questionsFromLeetcode;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        Ask user a number:
        System.out.println("Enter a number:");
//        take the input
        int number = input.nextInt();


//        We'll assume that the number is prime initially
        boolean isPrime = true;

//        Check if the number is prime:
        for(int i=2; i <= Math.sqrt(number); i++){

            if(number % i == 0) {

//            if the number is divisible by any number between 2 and its square root, it is not prime

                isPrime = false;
                break;
            }
        }
//        print the result

        if(isPrime){
            System.out.println(number + " is a prime number.");
        }else{

        System.out.println(number+ " is not prime number.");
        }
    }
}

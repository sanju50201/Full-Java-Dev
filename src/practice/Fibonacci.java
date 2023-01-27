package practice;

import java.util.Scanner;

public class Fibonacci {
//    Fibonacci is the sum of two previous numbers:

    public static void main(String[] args) {

//        Set the number of terms to generate
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the terms: ");
        int numTerms = input.nextInt();

//        initialise the first two numbers;
        int num1 = 0, num2 = 1;

//        print the first two numbers
//        System.out.println(num1 + " " +num2);

//        generate and print the remaining terms
        for(int i = 2; i<numTerms;i++){
            int nextNum = num1 + num2;
            System.out.print(nextNum+ " ");
            num1 = num2;
            num2 = nextNum;
        }
    }
}

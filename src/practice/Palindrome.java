package practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String: ");

        // read the string from the input
        String str = input.nextLine();

//        since we need only alphabets, let's remove all the non-alphabetical terms, and convert it to lowercase
        str = str.replaceAll("[^A-Za-z]", "").toLowerCase();

//        assume that the string is already a palindrome
        boolean isPalindrome = true;

//        check the condition

        for(int i =0; i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length() - i -1)){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println(str + " is palindrome");
        }else{
            System.out.println(str + " is not a palindrome.");
        }
    }
}

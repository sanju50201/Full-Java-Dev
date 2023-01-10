package practice;

import java.util.Scanner;

public class CheckVowel {
    static boolean hasVowels(String input){
//      with the help of regex we can check the match
        return input.toLowerCase().matches(".*[aeiou].*");

    }
    public static void main(String[] args) {
        System.out.println(hasVowels("Hello")); // returns true
        System.out.println(hasVowels("TBD")); // returns false

    }
}

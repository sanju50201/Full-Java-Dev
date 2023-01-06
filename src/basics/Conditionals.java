package basics;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        String finalUserName = "admin";
        String finalPassword = "admin";
        System.out.println("Welcome to the portal!");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String userName = input.nextLine();
        System.out.println("Enter your password:");
        String password = input.nextLine();

        if((userName.equals(finalUserName)) && (password.equals(finalPassword))){
            System.out.println("Login Success!");
        }else{
            System.out.println("Login Failed!");
        }
    }
}

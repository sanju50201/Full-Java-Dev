package functions;

import java.util.Scanner;

public class Arguments  {

    static int sum(int num1, int num2){
        return num1 + num2;
    }
    static String greetMessage(String name){
        return "Hello, "+name;
    }
    public static void main(String[] args) {
        System.out.println("The sum is: "+sum(4,5));
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.next();
        String specialMessage = greetMessage(name);
        System.out.println(specialMessage);
       }
}

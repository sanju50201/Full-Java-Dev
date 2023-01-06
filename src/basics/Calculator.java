package basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;
//        take input from user until he presses x
        while(true){
            System.out.println("Enter the operator: ");
            char operation = input.next().trim().charAt(0); // takes only the first character
            if(operation == '+' || operation == '-' || operation == '*' || operation == '/' || operation == '%'){
//                take input
                System.out.println("Enter the first number: ");
                int num1 = input.nextInt();
                System.out.println("Enter the second number: ");
                int num2 = input.nextInt();

                if(operation == '+'){
                    result = num1+num2;
                }
                if(operation == '-'){
                    result = num1 - num2;

                }
                if(operation == '*'){
                    result = num1 * num2;

                }
                if(operation == '/'){
                    if(num2 != 0){
                        result = num1/num2;

                    }
                }
                if(operation == '%'){
                    result = num1 % num2;

                }
            } else if (operation == 'x' || operation == 'X') {
                break;
            }else{
                System.out.println("Invalid Operation given!");
            }
            System.out.println("Result: "+result);

        }
        System.out.println("Thank you for using!");
    }
}

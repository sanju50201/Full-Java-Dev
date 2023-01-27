package bankapplication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BankAccount bankAccount = new BankAccount();
        int choice;
        do{
            System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Create Account\n5. View Transactions\n6. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the amount to deposit: ");
                    double amount = input.nextDouble();
                    bankAccount.deposit(amount);
                }
                case 2 -> {
                    System.out.print("Enter the amount to withdraw: ");
                    double amount = input.nextDouble();
                    bankAccount.withDraw(amount);
                }
                case 3 -> bankAccount.checkBalance();
                case 4 -> {
                    System.out.print("Enter your name: ");
                    String name = input.nextLine();
                    System.out.print("Enter your address: ");
                    String address = input.nextLine();
                    System.out.print("Enter your phone number: ");
                    String phoneNumber = input.nextLine();
                    System.out.print("Enter initial deposit amount: ");
                    double amount = input.nextDouble();
                    ;
                    BankAccount account = new BankAccount(name, amount, address, phoneNumber);
                    System.out.println("Account created successfully! Your account number is: " + account.accountNumber);
                }
                case 5 -> bankAccount.viewTransactions();
                case 6 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        }while (choice != 6);
    }
}

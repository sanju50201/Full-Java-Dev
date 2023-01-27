package bankapplication;

import java.util.*;

public class BankAccount {

    private static final Map<Integer, BankAccount> accounts = new HashMap<>();
    private final List<String> transactions = new ArrayList<>();


    String name;
    private double balance;

    String phoneNumber;
     String address;
    int accountNumber;

    public BankAccount(String name, double balance, String phoneNumber, String address) {

        this.name = name;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.accountNumber = new Random().nextInt(9000000) + 1000000;

        accounts.put(this.accountNumber, this);
    }

    public BankAccount() {
        this.balance = balance;
    }



    public void deposit(double amount){
        balance += amount;
        transactions.add("Deposited: "+amount);
        System.out.println("Deposited: "+amount);
        System.out.println("New Balance: "+balance);
    }

    public void withDraw(double amount){
        if(amount <= balance){
            balance -= amount;
            transactions.add("Withdrew:"+amount);
            System.out.println("Withdrew: "+amount);
            System.out.println("New Balance: "+balance);
        }else{
            System.out.println("Insufficient Funds");
        }
    }

    public void checkBalance(){
        transactions.add("Checked Balance");
        System.out.println("Balance: "+balance);
    }
        public void viewTransactions(){
            System.out.println("Transaction History: ");
            for(String transaction:transactions){
                System.out.println(transaction);
            }
        }
}

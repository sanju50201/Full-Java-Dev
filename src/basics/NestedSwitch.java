package basics;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String dept = in.next();

        switch (empID) {
            case 1 -> System.out.println("Sanjith Kumar");
            case 2 -> System.out.println("Pavilion");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (dept) {
                    case "IT" -> System.out.println("IT ");
                    case "Management" -> System.out.println("Management");
                    default -> System.out.println("No dept found!");
                }
            }
            default -> System.out.println("Enter correct emp ID");
        }
    }
}

package basics;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
//        int day = 5;
//        String dayString = null;
//        switch (day){
//            case 1:
//                dayString = "Monday";
//                break;
//            case 2:
//                dayString = "Tuesday";
//                break;
//            case 3:
//                dayString = "Wednesday";
//                break;
//            case 4:
//                dayString = "Thursday";
//                break;
//            case 5:
//                dayString = "Friday";
//                break;
//            case 6:
//                dayString = "Saturday";
//                break;
//            case 7:
//                dayString = "Sunday";
//                break;
//            default:
//                System.out.println("Please provide something valid!");
//        }
//        System.out.println(dayString);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a fruit:");
        String fruit = input.next();
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("Sweet red fruit");
            case "WaterMelon" -> System.out.println("Summer Fruit");
            default -> System.out.println("Only Fruits!");
        }
    }
}

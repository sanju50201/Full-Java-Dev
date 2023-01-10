package practice;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = in.nextLine();

//        replace all spaces with an empty string
        String newString = str.replaceAll("\\s","");
        System.out.println("Strings after removing the spaces: "+newString);
    }
}

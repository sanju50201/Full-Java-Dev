package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //         Array list is dynamic, where you can you use it, when you don't know the size of array

//        we need to use wrapper classes to declare the type of the list
        ArrayList<Integer> list = new ArrayList<>(10);


//        Adding elements in a list
        list.add(21);
        list.add(23);
        list.add(34);
        list.add(35);
        list.add(36);
        list.add(37);
        list.add(38);

//        Updating the list
        list.set(0,99); // (index,value)
//        remove
        list.remove(2);

        System.out.println(list);

//        take input
    for(int i=0;i<5;i++){
        list.add(in.nextInt());
    }
    for(int i=0; i<5;i++){
        System.out.println(list.get(i)); //pass index here
    }

        System.out.println("Added Elements: "+ list);

    }
}

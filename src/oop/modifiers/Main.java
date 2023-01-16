package oop.modifiers;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A obj = new A(21,"Sanjith");
        System.out.println(obj);

//        ArrayList<Integer> list = new ArrayList<>();
//        list.DEFAULT_CAPACITY; => this is a private method, which cannot be accessed outside the class

        obj.getNum();

    }
}






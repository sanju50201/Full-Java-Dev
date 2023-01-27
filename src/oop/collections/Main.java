package oop.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(32);
        list2.add(42);
        list2.add(52);
        list2.add(62);
        System.out.println(list2);
    }
}

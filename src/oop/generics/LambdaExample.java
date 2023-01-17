package oop.generics;


import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }
//        list.forEach((item) -> System.out.println(item * 2));

//        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
//        list.forEach(fun);

        Operation sum = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation prod = (a, b) -> a * b;
        Operation div = (a, b) -> a / b;

        LambdaExample fun2 = new LambdaExample();
        System.out.println(fun2.operate(5,3,sum));
        System.out.println(fun2.operate(5,3,sub));
        System.out.println(fun2.operate(5,3,prod));
        System.out.println(fun2.operate(5,3,div));
    }

//    int sum(int a, int b){
//        return a  + b;
//    }
    private int operate(int a, int b, Operation op){
        return op.operation(a,b);
    }
}

interface Operation{
    int operation(int a, int b);
}
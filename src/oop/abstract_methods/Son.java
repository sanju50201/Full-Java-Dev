package oop.abstract_methods;

public class Son extends Parent{

    public Son(int age) {
        super(age);
    }

    @Override
    void career(){
        System.out.println("I will be a programmer");

    }

    @Override
    void partner(){
        System.out.println("I love Tsunade.");
    }
}

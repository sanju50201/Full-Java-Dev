package oop.abstract_methods;

public abstract class Parent {
    int age;
    final int VALUE;
    public Parent(int age) {
        this.age = age;
        VALUE = 23243;
    }
    // we cannot create abstract constructors
//    abstract Parent();
    static void hello() {
        System.out.println("Hello!");
    }

    void simple(){
        System.out.println("This is a simple method.");
    }
    abstract void career();
    abstract void partner();
}

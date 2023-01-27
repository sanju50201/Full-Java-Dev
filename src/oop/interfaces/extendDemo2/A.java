package oop.interfaces.extendDemo2;

public interface A {
//    call via the interface name
    default void fun(){
        System.out.println("I am in A");
    }

//    static should have a body, in Interfaces
    static void greeting(){

    }
}

package oop.interfaces.nestedInterfaces;


// this should always be declared as public
public class A {

//    nested interface

//    can have different modifiers
    public interface NestedInterface{
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface{
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}



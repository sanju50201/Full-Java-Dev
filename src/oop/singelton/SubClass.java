package oop.singelton;

import oop.modifiers.A;

public class SubClass extends A {

    public SubClass(int num, String name)
    {
        super(num, name);
//        Object
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(21,"Sanju");
        int n = obj.num;
    }
}

class SubSubClass extends SubClass{

    public SubSubClass(int num, String name) {
        super(num, name);
    }
    public static void main(String[] args) {
        SubSubClass obj = new SubSubClass(21,"Sanju");
        int n = obj.num;

    }
}
class SubClass2 extends A {

    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(21,"Sanju");
//        int n = obj.num;
    }
}
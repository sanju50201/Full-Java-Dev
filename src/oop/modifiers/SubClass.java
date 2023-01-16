package oop.modifiers;

public class SubClass extends A{

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(21,"Sanju");
        int n = obj.num;
        System.out.println(obj instanceof A);

    }
}

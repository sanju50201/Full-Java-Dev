package oop.cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{2,3,4,5,56};
    }

//    public Human(Human other) {
//        this.age = other.age;
//        this.name = other.name;
//    }

    @Override
    public Object clone() throws CloneNotSupportedException{
//        this is called shallow copy
        return super.clone();
    }
}

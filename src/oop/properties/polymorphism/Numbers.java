package oop.properties.polymorphism;

public class Numbers {
    int sum(int a, int b){
        return a  + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
    public static void main(String[] args) {

        Numbers obj = new Numbers();
//        Compile time/Static polymorphism
        obj.sum(4,5);
        obj.sum(6,7,8);

    }
}

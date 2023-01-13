package oop.properties.polymorphism;

public class Main {
//    Polymorphism => act of representing the same thing in multiple ways
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Shapes square = new Square();
        square.area();
    }
}

package oop.properties.polymorphism;

public class Circle extends Shapes{
    @Override // annotation
    void area(){
        System.out.println("Area is pi * r * r");
    }
}

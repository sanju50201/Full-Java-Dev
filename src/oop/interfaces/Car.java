package oop.interfaces;

public class Car implements Engine, Brake, Media{


    @Override
    public void brake() {
        System.out.println("The brake is pretty normal.");
    }

    @Override
    public void start() {
        System.out.println("The engine start is simple.");
    }

    @Override
    public void stop() {
        System.out.println("The engine stop is simple.");
    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate well.");
    }



}

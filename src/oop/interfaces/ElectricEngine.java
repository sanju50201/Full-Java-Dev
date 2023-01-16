package oop.interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("EV starts.");
    }

    @Override
    public void stop() {
        System.out.println("EV stops.");
    }

    @Override
    public void accelerate() {
        System.out.println("EV is accelerating.");
    }
}

package oop.interfaces;

public class PetrolEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Petrol Engine starts.");
    }

    @Override
    public void stop() {
        System.out.println("Petrol Engine stops.");
    }

    @Override
    public void accelerate() {

        System.out.println("Petrol Engine accelerates.");
    }
}

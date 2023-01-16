package oop.interfaces;

public class Main {
    public static void main(String[] args) {

//        Car car = new Car();
//        car.accelerate();
//        car.brake();
//        car.start();
//        car.stop();
//
//        Media carMedia = new Car();
//        carMedia.start();
//        carMedia.stop();

        // this is a reference to the ElectricEngine class
//        ElectricEngine ev = new ElectricEngine();
//        ev.accelerate();
//        ev.start();
//        ev.stop();
//
//        // this is a reference to the CdPlayer class
//
//        CdPlayer cd = new CdPlayer();
//        cd.start();
//        cd.stop();
//
////        this is a reference to the PetrolEngine class
//
//        PetrolEngine pe = new PetrolEngine();
//        pe.start();
//        pe.accelerate();
//        pe.stop();

        NiceCar car = new NiceCar();
        car.start();
        car.playMusic();

        // here the Car class will be changed
        car.upgradeEngine();
        car.start();
        car.stop();


    }
}

package oop.interfaces;

public class NiceCar {
    private Engine engine;
    private Media player= new CdPlayer();

    public NiceCar() {
        engine = new PetrolEngine();
    }

    public NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void accelerate(){
        engine.accelerate();
    }
    public void playMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
}

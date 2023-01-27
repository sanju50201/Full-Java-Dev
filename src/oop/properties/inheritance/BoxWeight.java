package oop.properties.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }
    BoxWeight (BoxWeight other){
        super(other);
        weight = other.weight;
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double length, double height, double width, double weight) {
        super(length, height, width); // calling the parent class constructor
//        used to initialize values from the parent class

//        System.out.println(super.width);
        this.weight = weight;
    }
}

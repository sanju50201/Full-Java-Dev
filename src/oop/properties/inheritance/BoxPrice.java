package oop.properties.inheritance;

//This class is an example for Multilevel Inheritance
public class BoxPrice extends BoxWeight{
    double price;

     BoxPrice(){
        super();
        this.price = -1;
     }

     BoxPrice(BoxPrice other){
         super(other);
         this.price = other.price;
     }

    public BoxPrice(double length, double height, double width, double weight, double price) {
        super(length, height, width, weight);
        this.price= price;
    }

    public BoxPrice(double side, double weight, double price) {
        super(side, weight);
        this.price = price;
    }
}

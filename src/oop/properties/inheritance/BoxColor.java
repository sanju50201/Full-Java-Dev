package oop.properties.inheritance;

public class BoxColor extends BoxPrice{
    String color;


     BoxColor() {
        this.color = color;
     }

    public BoxColor(BoxPrice other, String color) {
        super(other);
        this.color = color;
    }

    public BoxColor(double length, double height, double width, double weight, double price, String color) {
        super(length, height, width, weight, price);
        this.color = color;
    }

    public BoxColor(double side, double weight, double price, String color) {
        super(side, weight, price);
        this.color = color;
    }
}

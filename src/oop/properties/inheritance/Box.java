package oop.properties.inheritance;

public class Box {
    double length;
    double height;
    double width;

    public Box() {
        this.length = -1;
        this.height = -1;
        this.width =-1;
    }

//    cube
    Box(double side){
        this.height = side;
        this.width = side;
        this.length = side;
    }

    Box(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    Box(Box old){
        this.length = old.length;
        this.height = old.height;
        this.width = old.width;
    }

    public void information(){
        System.out.println("The box is running!");
    }
}

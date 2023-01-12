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

        /**
         * Class Object is the root of the class hierarchy.
         * Every class has Object as a superclass. All objects, including arrays,
         * implement the methods of this class.
         */

        super();
        this.height = side;
        this.width = side;
        this.length = side;
    }

    Box(double length, double height, double width) {
        System.out.println("Box class Constructor");
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

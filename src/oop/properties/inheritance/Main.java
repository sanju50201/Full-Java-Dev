package oop.properties.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box();
//        Box box2 = new Box(3.4);
//        Box box3 = new Box(45.5,43.43,1.2);
//        Box newBox = new Box(box3);
//        System.out.println(box.length + " " + box.height+ " "+ box.width);
//        System.out.println(box2.length + " " + box2.height+ " "+ box2.width);
//        System.out.println(box3.length + " " + box3.height+ " "+ box3.width);
//        System.out.println(newBox.length + " " +newBox.height+ " "+ newBox.width);


        /*
        * A child class can access the properties of parent class, however
        * a parent class doesn't have the access to the properties of child class
        * */
//        BoxWeight box4 = new BoxWeight();
//        BoxWeight box5 = new BoxWeight(2,3,4,5);
//        System.out.println(box5.height +" "+ box5.width+ " "+ box5.length+" "+ box5.weight);

        Box box6 = new BoxWeight(2,3,4,5);
        System.out.println(box6.length+ " "+ box6.width+ " " + box6.height);


    }
}

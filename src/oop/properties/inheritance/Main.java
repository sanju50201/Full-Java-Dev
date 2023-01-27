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

//        you cannot have child reference variable and parent object
//        Box box6 = new BoxWeight(2,3,4,5);
//        System.out.println(box6.length+ " "+ box6.width+ " " + box6.height);

//        BoxPrice inBox = new BoxPrice(3.2,312.43,3.4,6.7,5.5);
//        BoxPrice inBox2 = new BoxPrice();
//        System.out.println(inBox.length + " "+ inBox.price+" "+ inBox.height+ " "+inBox.weight+" "+ inBox.width);
//        System.out.println(inBox2.length + " "+ inBox2.price+" "+ inBox2.height+ " "+inBox2.weight+" "+ inBox2.width);

//        BoxPrice box = new BoxPrice(5,6,7);
//        System.out.println(box);

        BoxColor box1 = new BoxColor();
        BoxColor box2 = new BoxColor(2.4,5.6,6.7,65.7,5.6,"Black");
        System.out.println(box2.color);
    }
}

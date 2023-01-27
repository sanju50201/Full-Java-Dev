package oop.staticExample;

//demo program to show initialization of static variables
public class StaticBlock {

    static int a = 10;
    static int b;

//    runs only for the first time when it is created, i.e., when the class is loaded for the first time

    static{
        System.out.println("This is a static block!");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
//        System.out.println(a);
//        System.out.println(b);
        System.out.println("Inside the Static Block Class: "+StaticBlock.a + " " + StaticBlock.b);
        StaticBlock.b += 3;
        System.out.println("Inside the Static Block Class: "+StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj1 = new StaticBlock();
        Random obj2 = new Random();
        System.out.println("Calling Random Class: " + Random.num1 + " "+ Random.num2);
    }

}

class Random{
    static int num1 = 10;
    static int num2;
    static {
        System.out.println("Inside the static of random");
        num2 = num1/2;
    }
}

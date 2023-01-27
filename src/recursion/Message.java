package recursion;

public class Message {
//    function prints Hello world
    public static void message(){
            System.out.println("Hello, World!");
            message2();
    }
    public static void message2(){
        System.out.println("Hello, World!");
        message3();
    }
    public static void message3(){
        System.out.println("Hello, World!");
        message4();
    }
    public static void message4(){
        System.out.println("Hello, World!");
        message5();
    }
    public static void message5(){
        System.out.println("Hello, World!");
    }
    public static void main(String[] args) {
            message();
    }
}

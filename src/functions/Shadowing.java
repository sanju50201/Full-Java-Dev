package functions;

public class Shadowing {

//    static means object independent, in order to access variables outside a scope, the variable should be static
    static int a ;
    public static void main(String[] args) {
//        System.out.println(a);  non-static variable a cannot be referenced from a static context
        a = 12;
        System.out.println(a);
        stupid();
    }

    static void stupid(){
        a = 23;
        System.out.println(a);
    }
}

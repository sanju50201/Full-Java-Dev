package functions;

import java.util.Arrays;

public class MethodOverloading {

    static void sum(int a, int b){
//        return a + b;
        System.out.println(a+b);
    }
    static float sum(float num1,float num2){
        return num1 + num2;
    }
    /*
    the above process is called method over loading, methods with same name,
    but different return types
    */

    static void fun(int a){
        System.out.println("First one!");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("Second one!");
        System.out.println(name);
    }
//    Method overloading with varargs
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static  void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    public static void main(String[] args) {
//        System.out.println(sum(2,3));
//        System.out.println("The sum of floats is: "+sum(1.5f,2.5f));
        fun(3);
        fun("Hello");
        demo(4,5,6,7,7,8);
        demo("Hello","Hi","Hey","Sup");

    }
}

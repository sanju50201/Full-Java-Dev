package functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(3,54,56,43,675,876,342,56,453);
        multiple(2,4,"Hello","Hey");
    }
    //variable length arguments must be the last in the list
    static void multiple(int a, int b, String ...v){
        System.out.println(a + " "+ b+" "+Arrays.toString(v));
    }
//    if you don't know the amount of integers being passed:
    static void fun(int ...v){
//        this takes an array of integers(data type)
        System.out.println(Arrays.toString(v));
    }
}

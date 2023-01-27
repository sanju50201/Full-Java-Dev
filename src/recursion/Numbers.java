package recursion;

public class Numbers {
    public static void print1(int n){
        System.out.println(n);
        print2(n);
    }
    public static void print2(int n){
        System.out.println(++n);
        print3(n);
    }
    public static void print3(int n){
        System.out.println(++n);
        print4(n);
    }
    public static void print4(int n){
        System.out.println(++n);
        print5(n);
    }
    public static void print5(int n){
        System.out.println(++n);
    }
    public static void main(String[] args) {
        print1(1);
    }
}

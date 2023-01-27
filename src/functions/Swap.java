package functions;

public class Swap {
//    swap function
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
//        swapping two values
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a);
         swap(a,b);
        System.out.println(a + " "+b);
    }
}

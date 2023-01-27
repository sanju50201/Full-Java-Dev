package practice;

public class SwapWOThird {

    public static void main(String[] args) {
        int a = 10, b = 20;
        //b is the sum of the both numbers
        b = b + a;
        a = b -a; // here a is swapped
        b = b-a;  // here b is swapped
        System.out.println(a);
        System.out.println(b);
    }
}

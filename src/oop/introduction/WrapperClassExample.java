package oop.introduction;

public class WrapperClassExample {
    public static void main(String[] args) {
//		wrapper classes can be used to convert the primitive data type to object
        Integer num = 45;
        System.out.println(num);
//		int a = 20, b = 56;
        Integer a = 30;
        Integer b = 3221;
        swap(a,b);
        System.out.println(a + " " + b);

        final int BONUS = 2; // cannot be modified

        final A firstStudent = new A("Sanjith Kumar");
        firstStudent.name  = "New NAme";

        // when non primitive is final you cannot re assign it
//		firstStudent = new A("new obj");

        A obj;
        for(int i=0;i<1000000000;i++) {
            obj = new A("Random name");
        }
    }

    static void swap(Integer a, Integer b) {
        int temp = a;
        a = b;
        b = temp;
    }




}

class A{
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Destroyed");
    }
}

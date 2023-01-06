package basics;

public class DataTypes {
    public static void main(String[] args) {
//        These are the primitive data types in Java
        byte b = 25;
        short s = 1024;
        int i = 31221;
        float f = 5434.4234f;
        double d = 433242.4332321324;
        long l = 13242345325432L;
        char c = 'A';
        boolean isThere = false;
        String name = "Sanju";
        double result = (b * s) + (f/c) + (d * l);
        System.out.println(result);

//        Operators
        int num1 = 10;
        int num2 = 3;
        System.out.println("Addition: "+(num1+num2));
        System.out.println("Difference: "+(num1-num2));
        System.out.println("Product: "+(num1*num2));
        System.out.println("Quotient: "+(num1/num2));
        System.out.println("Remainder: "+(num1%num2));
        num1++;
        System.out.println(num1);
        num2--;
        System.out.println(num2);

    }
}

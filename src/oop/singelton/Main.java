package oop.singelton;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        /*
        * Here both reference variables are pointing to the
        * same object "instance", only one object is getting created
        * */

    }
}

package oop.singelton;

public class Singleton {
//    Singleton class is something were you can create only one object

//    int num = 0;
    private Singleton(){

    }

    private static Singleton instance;

    public static Singleton getInstance(){
//        check whether only 1 object is created
        if(instance == null){
            instance = new Singleton();
        }
        return  instance;
    }
}

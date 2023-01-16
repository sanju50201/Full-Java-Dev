package oop.abstract_methods;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(21);
        Daughter daughter = new Daughter(15);

        son.career();
        son.partner();
        daughter.career();
        daughter.partner();

//        You cannot create objects of ana abstract class
//        Parent mom = new Parent();
        Parent.hello();
        son.simple();
    }
}

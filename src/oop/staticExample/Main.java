package oop.staticExample;


public class Main {
    public static void main(String[] args) {
//        if the java files are in the same package, no need to import it
        Human firstHuman = new Human(21,"Sanjith",345454.32f,false);
        Human secondHuman = new Human(32,"John Doe",43324.32f,true);
        Human thirdHuman = new Human(6,"Lexi",0.0f,false);
//        System.out.println(firstHuman.name);
//        System.out.println(secondHuman.name);
//
////        Bad practice:
////        System.out.println(firstHuman.population);
////        System.out.println(secondHuman.population);
////        System.out.println(thirdHuman.population);
        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);
//        greeting();
//        Inside a static we cannot use anything which isn't static
    }

//    IF A METHOD IS NOT STATIC, THERE NEEDS TO BE AN OBJECT IN ORDER TO ACCESS THE STATIC CONTEXTS
//    this below method is not dependent on objects
    static void fun(){
        /*
        * You cannot access non-static stuff without referencing the instance
        * in the static context
        * */
        Main obj = new Main();
        // Non-static method 'greeting()' cannot be referenced from a static context
        obj.greeting(); // --> you cannot use this, because it requires an instance, but the function which you are using doesn't depend on instances
    }

    void fun2(){
        greeting();
    }
//    this is not static, so it belongs to an object, this method depends on object
    void greeting(){
        // fun(); --> we can have static methods in non-static
        System.out.println("Hey, there!");
    }
}

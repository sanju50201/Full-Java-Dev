package oop.enumExample;

public class Basic {
    enum Week implements A{

//        these are called enum constants
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
//        everything here is public, static and final members
//        since its final, cannot have child enums


        Week() {
            System.out.println("Constructor called for " + this);
        }

        @Override
        public void hello() {
            System.out.println("Hey, How are you?");
        }
//        this is not public or protected, only private or default
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

//        for(Week day:Week.values()){
//            System.out.println(day);
//        }
//        System.out.println(week.ordinal());
        week.hello();
    }
}

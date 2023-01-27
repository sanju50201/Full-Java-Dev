package oop.staticExample;
public class Human {
   int age;
   String name;
   float salary;
   boolean isMarried;

   static long population;

   static void greeting(){
      System.out.println("Hello World!");
//      System.out.println(this.age); ==> 'oop.staticExample.Human.this' cannot be referenced from a static context
   }
   public Human(int age, String name, float salary, boolean isMarried){
      this.age = age;
      this.name = name;
      this.salary = salary;
      this.isMarried = isMarried;
      Human.population += 1;
//      Human.greeting();
   }
}

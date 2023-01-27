package oop.cloning;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human h1 = new Human(21, "Sanjith");
//        Human twin = new Human(h1);

        Human twin = (Human)(h1.clone());
        System.out.println(twin.age + " "+ twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        twin.name = "Punith";

        System.out.println(Arrays.toString(h1.arr));
//        changes to newly assigned value
        System.out.println(twin.name);
    }
}


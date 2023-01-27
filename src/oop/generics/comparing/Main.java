package oop.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(21,46.67f);
        Student s2 = new Student(32,89.54f);
        Student s3 = new Student(34,97.54f);
        Student s4 = new Student(35,79.54f);
        Student s5 = new Student(42,69.54f);
        Student s6 = new Student(52,82.54f);
        Student s7 = new Student(62,74.14f);
        Student s8 = new Student(78,99.12f);

        Student[] list = {s1,s2,s3,s4,s5,s6,s7,s8};
        System.out.println(Arrays.toString(list));


//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int)(o1.marks-o2.marks);
//            }
//        });

        Arrays.sort(list, (o1, o2) -> (int)(o1.marks-o2.marks));


        System.out.println(Arrays.toString(list));
//        if(s1.compareTo(s2) < 0){
//        System.out.println(s1.compareTo(s2));
//        System.out.println("S2 has more marks.");
//    }else{
//        System.out.println(s1.compareTo(s2));
//        System.out.println("S1 has more marks.");
//    }
    }
}

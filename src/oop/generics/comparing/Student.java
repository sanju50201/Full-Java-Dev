package oop.generics.comparing;

import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student> {
    int rollNo;
    float marks;

    public Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + " ";
    }

    @Override
    public int compareTo(@NotNull Student o) {
//        the change we are making here, is getting sorted
        int diff = (int)(this.marks -o.marks);
        /*
        * if diff == 0: means both are equal
        * if diff < 1: means 0 is bigger else o is smaller
        * */

        return diff;
    }
}

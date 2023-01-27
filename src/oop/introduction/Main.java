package oop.introduction;

public class Main {
    public static void main(String[] args) {


//		this is an object of the class
        Student sanjith = new Student(21,"Sanju",87.32f); //Student() is default constructor
        Student punith = new Student();
//		sanjith.rno = 21;
//		sanjith.name = "Sanjith Kumar";
//		if the value is provided, then the default will be overriden
//		sanjith.marks = 98.67f;
        System.out.println(sanjith.rno);
        System.out.println(sanjith.name);
        System.out.println(sanjith.marks);
//		sanjith.changeName("Coder");
//		sanjith.greetings();
        System.out.println(punith.rno +" "+ punith.name+ " " + punith.marks);

        Student random= new Student(sanjith);
        System.out.println(random.name);

        Student rand2 = new Student();
        System.out.println(rand2.name + " "+ rand2.rno + " "+rand2.marks);


        Student one = new Student();
        Student two = one;

        one.name = "New";
        System.out.println(two.name);
    }

}

//	This is a custom Student class
class Student {

    int rno;
    String name;
    float marks;



    void greetings() {
        System.out.println("My name is "+this.name);
    }
    void changeName(String newName) {
        name = newName;
    }
    Student (Student other){
        this.name = other.name;
        this.rno= other.rno;
        this.marks = other.marks;
    }
    //	this is a custom constructor
    Student() {
//		"this" is referring to the Student
//		this.rno = 61;
//		this.name = "Sanju";
//		this.marks = 98.32f;

        // constructor can be called from another constructor, using this way

        this(43,"John",32.32f);

    }

    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name= name;
        this.marks = marks;
    }
}

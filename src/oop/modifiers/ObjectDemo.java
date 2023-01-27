package oop.modifiers;

public class ObjectDemo {

    int num;
    double gpa;

    public ObjectDemo(int num1, double gpa) {
        this.num = num1;
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(12, 56.43);
        ObjectDemo obj2 = new ObjectDemo(12, 56.43);
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());

        if(obj1.equals(obj2)){
            System.out.println("obj1 is equal to obj2");

        }
        System.out.println(obj1.getClass());
    }
}

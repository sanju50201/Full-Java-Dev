package functions;

public class Scope {
    static void rand(int a,int  b){
        int temp = a;
        a = b;
        b = temp;
//        here a & b are accessible only in the rand function, cannot be accessed outside

//        Block scope:
//        if the value is already initialized outside the block, it can be accessed inside the block
        {
            a = 78;
            int c = 45;
        }
//        System.out.println(c); --> cannot access variables in a block scope

//        scoping in loops => only accessible in the loop
        for(int i=0;i<4;i++){
            int number = 234;
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
//        Function Scope is something where you can access your variable within the function.
//        System.out.println(a); => cannot access it outside
    }
}

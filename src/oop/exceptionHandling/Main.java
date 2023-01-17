package oop.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//            divide(a,b);
//            throw new Exception("For Fun!");
//            the more strict exceptions should have the higher priority, ArithmeticException is a subclass of Exception
                String name = "Sanjith";
            throw new MyException("Name is Sanju");
        } catch(MyException e){
            System.out.println(e.getMessage());
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Returning a exception");
        }finally {
            System.out.println("This is done.");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Cannot divide by Zero!");
        }
        return a /b;
    }
}

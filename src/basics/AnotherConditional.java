package basics;

public class AnotherConditional {
    public static void main(String[] args) {
        int age = 11;
        boolean hasLicence = false;
        if(age>=18 && hasLicence){
            System.out.println("You can drive!");
        }else if( age >= 18 && !hasLicence){
            System.out.println("You are over 18, apply for it.");
        }
        else{
            System.out.println("Can't drive!");
        }
    }
}

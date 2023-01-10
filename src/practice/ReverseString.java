package practice;

public class ReverseString {
    static String reverse(String str){
        StringBuilder reversed = new StringBuilder();
        for(int i=str.length() - 1; i>= 0; i--){
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
    }
}

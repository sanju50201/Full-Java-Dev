package searching.linearSearch;

public class EvenDigits {
    public static int evenDigits(int[] arr){
        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] % 2 == 0){
//                count++;
//            }
//        }
        for(int num:arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

//    function to check whether digits contain even digits or not
    private static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }
    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }
        if( num == 0) return 1;
        int count = 0;

        while(num > 0){
            count++;
            num = num/10;
        }
        return count;
    }

    static int digits2(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num) + 1);
    }

    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        int ans = evenDigits(arr);
//        System.out.println(ans);
        System.out.println(digits2(-343232));
    }
}

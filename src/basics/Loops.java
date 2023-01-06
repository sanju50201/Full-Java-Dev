package basics;

public class Loops {
    public static void main(String[] args) {
//    for loop
        for(int i=0;i<10;i++){
            System.out.println("Indexes: "+i);
        }

//        for each loop
        int[] arr = {1,2,3,4,5};
        for (int j : arr) {
            System.out.println(j);
        }

//        while loop

        int count = 1;
        while(count != 5){
            System.out.println("Count: "+count);
            count++;
        }

//        Do while loop
        int counter = 0;
        do{
            System.out.println("Counter: "+counter);
            counter++;
        }while( counter != 5);
    }
}

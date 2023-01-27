package oop.generics;

import java.util.Arrays;
import java.util.List;

//here T should be a number class or subclasses of the number.
public class WildCardExample<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildCardExample() {
        this.data = new Object[DEFAULT_SIZE];
    }


//    here this is wild card
    public void getList(List<? extends Number> list){

    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize(){
        Object[] temp =  new Object[data.length *2];

//        copy the parent element to the temp array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    private boolean isFull() {
        return size == data.length;
    }

    public T remove(){
        T removed = (T)(data[size--]);
        return removed;
    }

    public T get(int index){
        return (T)(data[index]);
    }
    public int size(){
        return size;
    }
    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        WildCardExample<Number> list = new WildCardExample<>();
        for (int i = 0; i < 14; i++) {
            list.add(i * 3.32);
        }
        System.out.println(list);
    }
}

package org.jupiter.kgl.others.generics.arrayGenerics;

public class GenericArray<T> {
    private T[] array;
    public GenericArray(int size){
        array = (T[])new Object[size];
    }
    public void put(int idx, T item){
        array[idx] = item;
    }
    public T get(int idx){
        return array[idx];
    }
    //Method that exposes the underlying representation:
    public T[] rep(){
        return array;
    }

    public static void main(String[] args) {
        GenericArray<Integer> intArray = new GenericArray<>(10);
        //This causes a ClassCastExp
//        Integer[] ia = intArray.rep();

        //This is ok
        Object[] oa = intArray.rep();
        System.out.println(intArray.get(2));
    }
}

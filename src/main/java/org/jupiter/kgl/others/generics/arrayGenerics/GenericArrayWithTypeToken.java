package org.jupiter.kgl.others.generics.arrayGenerics;

import java.lang.reflect.Array;

public class GenericArrayWithTypeToken<T> {
    private T[] array;
    public GenericArrayWithTypeToken(Class<T> type, int size){
        array = (T[])Array.newInstance(type, size);
    }
    public void put(int idx, T item){
        array[idx] = item;
    }
    public T get(int idx){
        return array[idx];
    }
    public T[] rep(){
        return array;
    }

    public static void main(String[] args) {
        GenericArrayWithTypeToken<Integer> intArray = new GenericArrayWithTypeToken<>(Integer.class, 10);
        //works
        Integer[] ia = intArray.rep();
    }
}

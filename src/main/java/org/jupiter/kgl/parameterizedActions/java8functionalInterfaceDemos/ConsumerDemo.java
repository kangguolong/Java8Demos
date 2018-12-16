package org.jupiter.kgl.parameterizedActions.java8functionalInterfaceDemos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T t : list) {
            consumer.accept(t);
        }
    }

    public static void main(String[] args) {
        forEach(Arrays.asList(1, 2, 34, 5, 6), (Integer i) -> System.out.println(i));
    }
}

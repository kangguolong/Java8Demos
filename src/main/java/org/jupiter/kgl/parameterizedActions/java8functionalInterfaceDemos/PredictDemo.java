package org.jupiter.kgl.parameterizedActions.java8functionalInterfaceDemos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredictDemo {

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)){
                result.add(t);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Predicate<String> nonEmptyStringPredict = (String str) -> !str.isEmpty();
    }
}

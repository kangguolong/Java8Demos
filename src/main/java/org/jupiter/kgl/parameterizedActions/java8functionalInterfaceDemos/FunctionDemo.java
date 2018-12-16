package org.jupiter.kgl.parameterizedActions.java8functionalInterfaceDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {

    public static <T, R> List<R> map(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(function.apply(t));
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> lengthList = map(Arrays.asList("lambdas", "in", "action"), (String str) -> str.length());
        System.out.println(lengthList);
    }
}

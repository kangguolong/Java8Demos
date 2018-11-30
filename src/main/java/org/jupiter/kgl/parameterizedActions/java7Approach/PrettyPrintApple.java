package org.jupiter.kgl.parameterizedActions.java7Approach;

import org.jupiter.kgl.parameterizedActions.Apple;

import java.util.List;

public class PrettyPrintApple {

    public static void print(List<Apple> inventory, AppleFormatter formatter){
        for (Apple apple : inventory) {
            formatter.accept(apple);
        }
    }
}

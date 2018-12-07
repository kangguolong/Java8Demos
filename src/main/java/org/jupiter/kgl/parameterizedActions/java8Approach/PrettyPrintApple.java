package org.jupiter.kgl.parameterizedActions.java8Approach;

import org.jupiter.kgl.parameterizedActions.Apple;
import org.jupiter.kgl.parameterizedActions.java7Approach.AppleFormatter;

import java.util.Arrays;
import java.util.List;

public class PrettyPrintApple {

    public static void print(List<Apple> inventory, AppleFormatter formatter){
        for (Apple apple : inventory) {
            System.out.println(formatter.accept(apple));
        }
    }

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(new Apple("green", 80), new Apple("red", 180));
        print(inventory, (Apple a) -> "An apple of " + a.getWeight() + "g");
        print(inventory, (Apple a) -> {
            String characteristic = a.getWeight() > 150 ? "heavy" : "light";
            return "A " + characteristic + " " + a.getColour() + " apple";
        });
    }
}

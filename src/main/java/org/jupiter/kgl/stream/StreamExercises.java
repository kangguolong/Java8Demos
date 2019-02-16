package org.jupiter.kgl.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercises {
    private static final List<Dish> menu = Arrays.asList(
            new Dish("pork", false, 800, Dish.Type.MEAT),
            new Dish("beef", false, 700, Dish.Type.MEAT),
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("french fries", true, 530, Dish.Type.OTHER),
            new Dish("rice", true, 350, Dish.Type.OTHER),
            new Dish("season fruit", true, 120, Dish.Type.OTHER),
            new Dish("pizza", true, 550, Dish.Type.OTHER),
            new Dish("prawns", false, 300, Dish.Type.FISH),
            new Dish("salmon", false, 450, Dish.Type.FISH));

    private static List<String> provideMenuWithHighCalories(){
        return menu.stream().filter(dish -> dish.getCalories() > 300).map(Dish::getName).limit(3).collect(Collectors.toList());
    }

    private static void useDistinct(){
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream().filter(i -> i%2 == 0).distinct().forEach(System.out::println);
    }

    private static List<Dish> useLimit(){
        return menu.stream().filter(dish -> dish.getCalories() > 300).limit(3).collect(Collectors.toList());
    }

    private static List<Dish> useSkip(){
        return menu.stream().filter(dish -> dish.getCalories() > 300).skip(2).collect(Collectors.toList());
    }

    private static List<Integer> useMap(){
        List<String> words = Arrays.asList("Java 8", "Lambdas", "In", "Action");
        return words.stream().map(String::length).collect(Collectors.toList());
    }

    public static void main(String[] args) {
//        System.out.println(provideMenuWithHighCalories());
//        useDistinct();
//        System.out.println(useLimit());
//        System.out.println(useSkip());
        System.out.println(useMap());
    }
}

package org.jupiter.kgl.parameterizedActions.java7Approach;

import org.jupiter.kgl.parameterizedActions.Apple;

public class AppleFancyFormatter implements AppleFormatter {

    public String accept(Apple apple) {
        String characteristic = apple.getWeight() > 150 ? "heavy" : "light";
        return "A " + characteristic + " " + apple.getColour() + " apple";
    }
}

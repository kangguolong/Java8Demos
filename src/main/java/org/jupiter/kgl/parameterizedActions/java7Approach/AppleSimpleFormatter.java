package org.jupiter.kgl.parameterizedActions.java7Approach;

import org.jupiter.kgl.parameterizedActions.Apple;

public class AppleSimpleFormatter implements AppleFormatter {

    public String accept(Apple apple) {
        return "An apple of " + apple.getWeight() + "g";
    }
}

package org.jupiter.kgl.others.generics.clazzes;

import org.jupiter.kgl.others.generics.interfaces.Generator;

public class BasicGeneratorDemo {

    public static void main(String[] args) {
        Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
        for (int i=0; i<5; i++){
            System.out.println(gen.next());
        }
    }
}

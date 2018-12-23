package org.jupiter.kgl.others.generics.bounds;

public class SuperHero<POWER extends SuperPower> {
    POWER power;
    SuperHero(POWER power){
        this.power = power;
    }
    POWER getPower(){
        return power;
    }
}

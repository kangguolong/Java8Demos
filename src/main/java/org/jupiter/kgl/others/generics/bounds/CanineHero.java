package org.jupiter.kgl.others.generics.bounds;

public class CanineHero<POWER extends SuperHearing & SuperSmell> extends SuperHero<POWER> {
    CanineHero(POWER power) {
        super(power);
    }
    void hear(){
        power.hearSubtleNoises();
    }
    void smell(){
        power.trackBySmell();
    }
}

package org.jupiter.kgl.others.generics.bounds;

public class EpicBattle {
    static <POWER extends SuperHearing> void useSuperHearing(SuperHero<POWER> hero){
        hero.getPower().hearSubtleNoises();
    }
    static <POWER extends SuperHearing & SuperSmell> void superFind(SuperHero<POWER> hero){
        hero.getPower().hearSubtleNoises();
        hero.getPower().trackBySmell();
    }

    public static void main(String[] args) {
        DogBoy dogBoy = new DogBoy();
        useSuperHearing(dogBoy);
        superFind(dogBoy);
    }
}

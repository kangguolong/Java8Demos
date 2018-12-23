package org.jupiter.kgl.others.generics.bounds;

public class SuperSleuth<POWER extends XRayVision> extends SuperHero<POWER> {
    SuperSleuth(POWER power) {
        super(power);
    }
    void see(){
        power.seeThroughWalls();
    }
}

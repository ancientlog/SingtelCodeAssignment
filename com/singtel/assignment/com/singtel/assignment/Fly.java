package com.singtel.assignment;

public class Fly implements Flyable {
    @Override
    public String fly() {
        String flying = AnimalConstants.BehaviourConstants.FLYING;
        System.out.println(flying);
        return flying;

    }
}

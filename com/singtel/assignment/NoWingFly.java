package com.singtel.assignment;

public class NoWingFly implements Flyable {
    @Override
    public String fly() {
        String nowingfly = AnimalConstants.BehaviourConstants.NOWINGFLY;
        System.out.println(nowingfly);
        return nowingfly;
    }
}

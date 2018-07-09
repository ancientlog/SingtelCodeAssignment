package com.singtel.assignment;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChickenTest {

    Chicken chicken = new Chicken();

    @Test
    public void fly() {
    chicken.setFlyable(new NoWingFly());
    assertSame("cannot fly",AnimalConstants.BehaviourConstants.NOWINGFLY ,chicken.fly());
    }

    @Test
    public void sing() {
        chicken.setSingable(new ChickenSing());
        assertSame("chicken singing",AnimalConstants.BehaviourConstants.CHICKENSING,chicken.sing());
    }

    @Test
    public void walk() {
        chicken.setWalkable(new Walk());
        assertSame("can walk", AnimalConstants.BehaviourConstants.WALKING,chicken.walk());
    }
}
package com.singtel.assignment;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class DuckTest {

     Duck duck = new Duck();


    @Test
    public void sing() {
        duck.setSingable(new DuckSing());
        assertSame("duck singing",AnimalConstants.BehaviourConstants.DUCKSINGING,duck.sing());
    }

    @Test
    public void swim() {
        assertSame("duck swimming", AnimalConstants.BehaviourConstants.SWIMMING,duck.swim());
    }
}
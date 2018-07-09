package com.singtel.assignment;

import org.junit.Test;

import static org.junit.Assert.assertSame;

public class BirdTest {
    Bird bird = new Bird();
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void testBirdFly (){
     assertSame("bird can fly",AnimalConstants.BehaviourConstants.FLYING,bird.fly());
    }
    @Test
    public void testBirdWalk (){
     assertSame("bird can walk", AnimalConstants.BehaviourConstants.WALKING,bird.walk());
    }
    @Test
    public void testBirdSing (){
        assertSame("bird can sining",AnimalConstants.BehaviourConstants.SINGING,bird.sing());
    }
}
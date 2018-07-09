package com.singtel.assignment;

import org.junit.Test;

import static org.junit.Assert.*;

public class RoosterTest {
    Rooster rooster = new Rooster();

@Test
public void sing() {

    assertSame("duck singing",AnimalConstants.BehaviourConstants.RoosterSinging,rooster.sing());
}


}
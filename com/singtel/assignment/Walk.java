package com.singtel.assignment;

public class Walk implements Walkable {

@Override
    public String walk() {
    String walking = AnimalConstants.BehaviourConstants.WALKING;
    System.out.println(walking);
    return walking;
    }
}

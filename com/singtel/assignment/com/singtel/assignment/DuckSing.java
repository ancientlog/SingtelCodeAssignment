package com.singtel.assignment;

public class DuckSing implements Singable {
    @Override
    public String sing() {
        String ducksinging = AnimalConstants.BehaviourConstants.DUCKSINGING;
        System.out.println(ducksinging);
        return ducksinging;

    }
}

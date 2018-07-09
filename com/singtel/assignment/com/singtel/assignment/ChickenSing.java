package com.singtel.assignment;

public  class ChickenSing implements Singable {

    @Override
    public String sing() {
        String singing = AnimalConstants.BehaviourConstants.CHICKENSING;
        System.out.println("Cluck, cluck");
        return singing;
    }
}

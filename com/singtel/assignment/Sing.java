package com.singtel.assignment;

public class Sing implements Singable {
@Override
    public String sing() {

    String singing= AnimalConstants.BehaviourConstants.SINGING;
            System.out.println(singing);
            return singing;
    }
}

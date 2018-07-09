package com.singtel.assignment;



public  class RoosterSing implements Singable {

    @Override
    public String sing() {

        String roosterSinging = AnimalConstants.BehaviourConstants.RoosterSinging;
                System.out.println(roosterSinging);
        return roosterSinging;
    }
}

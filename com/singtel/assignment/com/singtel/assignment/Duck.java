package com.singtel.assignment;

public class Duck extends BaseBird implements Swimable {

 public Duck () {
       super();
    }

    @Override
    void myName() {
    System.out.println("--I'm a duck--");
    }

    @Override
    public String swim() {

    String swimming = AnimalConstants.BehaviourConstants.SWIMMING;
    System.out.println(swimming);
return swimming;
 }
}

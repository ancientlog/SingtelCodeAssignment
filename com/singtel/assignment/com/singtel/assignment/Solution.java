package com.singtel.assignment;


public class Solution {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.myName();
        bird.walk();
        bird.fly();
        bird.sing();

        Duck duck = new Duck();
        duck.myName();

        duck.walk();
        duck.fly();

        duck.setSingable(new Sing());
        duck.sing();
        duck.setSingable(new DuckSing());
        duck.sing();
        duck.swim();

        Chicken chicken = new Chicken();
        chicken.myName();
        chicken.walk();
        chicken.setFlyable(new NoWingFly());
        chicken.fly();
        chicken.sing();
        chicken.setSingable(new ChickenSing() {
        });
        chicken.sing();
    }
}

package com.singtel.assignment;

public class Rooster {
    Flyable flyable = new Fly();
    Singable singable = new RoosterSing();
    Walkable walkable = new Walk();

    public void Rooster(){}
    public String fly (){
        return flyable.fly();
    };
    public String sing(){
       return singable.sing();
    }
    public String walk() {
        return walkable.walk();
    };


}

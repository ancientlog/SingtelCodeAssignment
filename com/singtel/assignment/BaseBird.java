package com.singtel.assignment;

public abstract class BaseBird extends Animal {

    Flyable flyable;
    Singable singable;
    Walkable walkable;

    public BaseBird () {

    }

    public void setFlyable(Flyable flyable)
    {
        this.flyable = flyable;
    }

    public void setSingable (Singable singable)
    {
        this.singable = singable;
    }

    public void setWalkable (Walkable walkable) {this.walkable = walkable;}

    abstract void myName();

    public String fly (){
       return flyable.fly();
    }

    public String sing (){
        return singable.sing();
    }

    public String walk (){

       return walkable.walk();
    }

}

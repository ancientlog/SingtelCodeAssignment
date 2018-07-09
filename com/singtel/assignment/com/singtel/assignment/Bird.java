package com.singtel.assignment;

public class Bird extends BaseBird {

   public Bird (){
       super.flyable = new Fly();
       super.singable = new Sing();
       super.walkable = new Walk();
   }

    @Override
    public void myName() {
        System.out.println("I'm a bird");
    }
}


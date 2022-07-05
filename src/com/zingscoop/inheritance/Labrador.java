package com.zingscoop.inheritance;

public class Labrador extends Dog {

    public void likesTo() {
        //this.bark();  // We can access Dog behavior from here as well.
        System.out.println(this.getName() + " likes to Swim !!");
    }
    
}

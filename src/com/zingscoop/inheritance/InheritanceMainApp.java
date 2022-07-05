package com.zingscoop.inheritance;

public class InheritanceMainApp {

    public static void main(String[] args) {

        // Sub class object creation which can access
        // super class method and sub class methods as well
        Dog dog = (Dog) new Animal();
        dog.setName("Rocky");
        dog.bark();

        Cat cat = new Cat();
        cat.setName("Tommy");
        cat.meow();

        Labrador lab = new Labrador();
        lab.setName(("Caesar"));
        lab.bark();
        lab.likesTo();
    }
    
}

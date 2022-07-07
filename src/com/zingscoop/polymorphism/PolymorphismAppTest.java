package com.zingscoop.polymorphism;

public class PolymorphismAppTest {

    public static void main(String[] args) {
        System.out.println("Polymorphism my method overloading");
        Dog d = new Dog();
        d.makeSound();
        d.makeSound(2);

        System.out.println("Polymorphism my method overriding");

        Animal dog = new Dog();
        dog.makeSound();

        Animal cat = new Cat();
        cat.makeSound();

    }
    
}

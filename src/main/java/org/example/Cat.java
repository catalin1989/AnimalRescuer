package org.example;

public class Cat extends Animal {

    boolean destructiveBehavior;

    boolean furShed;

    public Cat(String name, int age, int health, int hunger, int happiness, String favouriteFood, String favouriteActivity) {
        super(name, age, health, hunger, happiness, favouriteFood, favouriteActivity);
    }
}

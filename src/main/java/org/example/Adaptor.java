package org.example;

public class Adaptor {

    int money;

     String name;

    public void feed(Animal animal,AnimalFood food){

        System.out.println(name+" feed "+animal.name+" with "+food.name);
        animal.hunger=0;
    }

    public void activity1(Activity activity, Animal animal ){

        System.out.println(name+" has "+activity.name+" "+animal.name);
        animal.happiness=10;
    }

}

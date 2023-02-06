package org.example;

public class Adaptor {

    int money;

     String name;

    public void feed(Animal animal,AnimalFood food){

        if (food.name=="Pedigree"){
            animal.happiness++;
        }
        System.out.println(name+" feed "+animal.name+" with "+food.name);
        animal.hunger--;
    }

    public void activity1(Activity activity, Animal animal ){

        if(activity.name=="walked"){
            animal.happiness++;
        }
        System.out.println(name+" has "+activity.name+" "+animal.name);
        animal.happiness++;
    }

}

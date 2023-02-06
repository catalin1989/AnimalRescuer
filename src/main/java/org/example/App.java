package org.example;

import java.util.Calendar;


public class App 
{
    public static void main( String[] args )
    {

        Animal animal=new Animal("Fluffy",5,5,5,5,"Pedigree","walked");

       Activity activity= new Activity("walked");

        Doctor doctor1=new Doctor("Joe","Veterinary");

        Doctor student = new Doctor("Angie","Veterinary student");

        Adaptor person= new Adaptor();
        person.name= "John";
        person.money=5000;



        Calendar d = Calendar.getInstance();
        d.set(2023,02,25);

        AnimalFood food= new AnimalFood("Pedigree",25,1,d);
        food.expireDate= d;

        Game game= new Game();
        game.owner= person.name;
        game.doctor= doctor1.name;
        game.dog=animal.name;

    person.feed(animal,food);
        System.out.println(animal.name+" hunger is "+animal.hunger);

    person.activity1(activity,animal);
        System.out.println(animal.name+" happiness is "+ animal.happiness);





    }
}

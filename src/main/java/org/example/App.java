package org.example;

import java.util.Calendar;


public class App 
{
    public static void main( String[] args )
    {

        Animal animal=new Animal("Fluffy",5,5,5,5,"Pedigree","walking");

       Activity activity= new Activity("waling");



        Doctor doctor1=new Doctor("Joe","Veterinary");


        Doctor student = new Doctor("Angie","Veterinary student");


        Adaptor person= new Adaptor();
        person.name= "Carol";
        person.money=5000;

        Calendar d = Calendar.getInstance();
        d.set(2023,02,25);

        AnimalFood food= new AnimalFood("Pedigree",25,1,d);
        food.expireDate= d;

        Game game= new Game();
        game.owner= person.name;
        game.doctor= doctor1.name;
        game.dog=animal.name;








    }
}

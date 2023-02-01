package org.example;

import java.util.Calendar;


public class App 
{
    public static void main( String[] args )
    {

        Animal animal=new Animal();

        animal.name= "Flyffy";
        animal.age=3;
        animal.favouriteActivity="walking";
        animal.favouriteFood= "Pedigree";
        animal.health=5;
        animal.hunger=5;
        animal.happiness=5;

        Activity activity= new Activity();

        activity.name="walking";

        Doctor doctor1=new Doctor();
        doctor1.name="Joe";
        doctor1.speciality="Vetenerian"

        Doctor student = new Doctor();
        student.name= "Angie";
        student.speciality="vetenerian student";

        Adaptor persone= new Adaptor();
        persone.name= "Carol";
        persone.money=5000;

        AnimalFood food= new AnimalFood();
        food.availability=true;
        food.name="Pedigree";
        food.price=50;
        food.quantity= 1;
        food.expireDate.toLocalDate();

        Game game= new Game();
        game.owner= persone.name;
        game.doctor= doctor1.name;
        game.dog=animal.name;








    }
}

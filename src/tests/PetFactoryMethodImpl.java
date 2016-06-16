package tests;

import creational.factory.Pet;
import creational.factory.PetFactory;

/**
 * Created by anurag on 11/6/16.
 * Tesing how our design works
 */
public class PetFactoryMethodImpl {

    public static void main(String args[])
    {
        PetFactory petFactory = new PetFactory();
        //Intializing Pet object from an Factory Method
        Pet pet = petFactory.getPet("Meow");
        System.out.println(pet.getPetSound());
    }

}

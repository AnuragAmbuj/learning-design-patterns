package creational.factory;

/**
 * Created by anurag on 11/6/16.
 * This class petfactory gives concrete instance for Pet interface and that is why this type of class design is known as
 * Factory based design or design based on Factory methods
 */
//Factory Class
public class PetFactory {
    //Factory Method for Pet
    public Pet getPet(String petType)
    {
        Pet pet = null;
        if("Bow".equals(petType))
            pet = new Dog();
        else if("Meow".equals(petType))
            pet = new Cat();
        return pet;
    }
}

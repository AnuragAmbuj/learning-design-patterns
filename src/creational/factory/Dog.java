package creational.factory;

/**
 * Created by anurag on 11/6/16.
 */
//Pet Entity Dog
public class Dog implements Pet {
    @Override
    public String getPetSound() {
        return "Bow Bow";
    }
}

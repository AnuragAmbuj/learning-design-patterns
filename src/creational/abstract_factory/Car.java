package creational.abstract_factory;

/**
 * Created by anurag on 11/6/16.
 */
//Abstract class Car
public abstract class Car {
    public abstract Parts getWheels();
    public abstract Parts getMirrors();
    public abstract Parts getEngine();
    public abstract Parts getBody();
}

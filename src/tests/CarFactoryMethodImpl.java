package tests;

import creational.abstract_factory.Car;
import creational.abstract_factory.CarFactory;

/**
 * Created by anurag on 11/6/16.
 */
public class CarFactoryMethodImpl {
    public static final void main(String args[])
    {
        CarFactory carFactory = new CarFactory();
        Car c = carFactory.getCar("BMW");
        System.out.println(c.getBody().getSpecs()+","+c.getEngine().getSpecs()+","+c.getMirrors().getSpecs()+","+c.getWheels().getSpecs());
    }
}

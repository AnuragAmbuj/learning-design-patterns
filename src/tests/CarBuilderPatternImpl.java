package tests;

import creational.builder.carbuilder.Car;
import creational.builder.carbuilder.CarBuilder;
import creational.builder.carbuilder.CarEngineer;
import creational.builder.carbuilder.LowEndCarBuilder;

/**
 * Created by anurag on 12/6/16.
 */
public class CarBuilderPatternImpl {

    public static void main(String args[])
    {
        CarBuilder carBuilder = new LowEndCarBuilder();
        CarEngineer carEngineer = new CarEngineer(carBuilder);
        carEngineer.buildCar();
        Car car = carEngineer.getCar();
        System.out.println("Constructed Car:"+car);
    }

}

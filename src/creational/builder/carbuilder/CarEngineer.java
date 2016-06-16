package creational.builder.carbuilder;

import creational.abstract_factory.*;

/**
 * Created by anurag on 12/6/16.
 */
public class CarEngineer {
    private CarBuilder carBuilder;
    public CarEngineer(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }
    public Car getCar(){
        return carBuilder.getCar();
    }
    public void buildCar(){
        carBuilder.buildBase();
        carBuilder.buildEngine();
        carBuilder.buildMirror();
        carBuilder.buildWheels();
        carBuilder.buildBody();
    }
}

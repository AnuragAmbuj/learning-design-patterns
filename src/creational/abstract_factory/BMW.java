package creational.abstract_factory;

/**
 * Created by anurag on 11/6/16.
 */
public class BMW extends Car{

    @Override
    public Parts getWheels() {
        return new Parts("BMW Wheel");
    }

    @Override
    public Parts getMirrors() {
        return new Parts("BMW Mirror");
    }

    @Override
    public Parts getEngine() {
        return new Parts("BMW V12 MEGA");
    }

    @Override
    public Parts getBody() {
        return new Parts("Superb BMW Decals");
    }
}

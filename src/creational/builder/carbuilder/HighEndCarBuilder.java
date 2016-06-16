package creational.builder.carbuilder;

/**
 * Created by anurag on 12/6/16.
 */
public class HighEndCarBuilder implements CarBuilder {

    private Car car;
    public HighEndCarBuilder(){
        car = new Car();
    }

    @Override
    public void buildBase() {
        car.setBase("High End Base");
    }

    @Override
    public void buildWheels() {
        car.setWheels("High End Wheels");
    }

    @Override
    public void buildEngine() {
        car.setEngine("High End V12+ Engine");
    }

    @Override
    public void buildMirror() {
        car.setMirror("High End anti-reflective mirror!");
    }

    @Override
    public void buildBody() {
        car.setBody("High end Carbonated Steel body!");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}

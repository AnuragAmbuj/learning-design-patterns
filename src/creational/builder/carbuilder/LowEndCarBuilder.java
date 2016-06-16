package creational.builder.carbuilder;

/**
 * Created by anurag on 12/6/16.
 */
public class LowEndCarBuilder implements CarBuilder {

    private Car car;
    public LowEndCarBuilder(){
        car = new Car();
    }
    @Override
    public void buildBase() {
        car.setBase("Low End Car Base");
    }

    @Override
    public void buildWheels() {
        car.setWheels("Low End Car Wheels");
    }

    @Override
    public void buildEngine() {
        car.setEngine("Low End <V2.2 Car Engine");
    }

    @Override
    public void buildMirror() {
        car.setMirror("Low End Reflective Car Mirror!");
    }

    @Override
    public void buildBody() {
        car.setBody("Low End Steel Body Car");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}

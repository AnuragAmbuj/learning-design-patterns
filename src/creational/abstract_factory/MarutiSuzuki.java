package creational.abstract_factory;

/**
 * Created by anurag on 11/6/16.
 */
public class MarutiSuzuki extends Car {
    @Override
    public Parts getWheels() {
        return new Parts("Maruti Suzuki Ultra Tyres");
    }

    @Override
    public Parts getMirrors() {
        return new Parts("Maruti Suzuki Anti reflective mirrors!!");
    }

    @Override
    public Parts getEngine() {
        return new Parts("Suzuki Maruti V4 Engine");
    }

    @Override
    public Parts getBody() {
        return new Parts("Maruti Suzuki Decals");
    }
}

package creational.abstract_factory;

/**
 * Created by anurag on 11/6/16.
 */
public class Audi extends Car {
    @Override
    public Parts getWheels() {
        return new Parts("CEAT TYRE AUDI45600");
    }

    @Override
    public Parts getMirrors() {
        return new Parts("SAMPLEX CONVEX DIFOCAL");
    }

    @Override
    public Parts getEngine() {
        return new Parts("V9 8000BHP");
    }

    @Override
    public Parts getBody() {
        return new Parts("DECALLED BRIDGESPEC BODY");
    }
}

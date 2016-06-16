package creational.abstract_factory;

/**
 * Created by anurag on 11/6/16.
 */
public class CarFactory {
    public Car getCar(String saleCar){
        if(saleCar.trim().equalsIgnoreCase("Audi"))
            return new Audi();
        else if(saleCar.trim().equalsIgnoreCase("BMW"))
                return  new BMW();
        else if(saleCar.trim().equalsIgnoreCase("MarutiSuzuki"))
            return new MarutiSuzuki();
        else
            return new Car() {
                @Override
                public Parts getWheels() {
                    return new Parts("Undefined");
                }

                @Override
                public Parts getMirrors() {
                    return new Parts("Undefined");
                }

                @Override
                public Parts getEngine() {
                    return new Parts("Undefined");
                }

                @Override
                public Parts getBody() {
                    return new Parts("Undefined");
                }
            };
    }
}

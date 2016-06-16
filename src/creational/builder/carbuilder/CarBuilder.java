package creational.builder.carbuilder;

/**
 * Created by anurag on 12/6/16.
 */
public interface CarBuilder {
    public void buildBase();
    public void buildWheels();
    public void buildEngine();
    public void buildMirror();
    public void buildBody();
    public Car getCar();
}

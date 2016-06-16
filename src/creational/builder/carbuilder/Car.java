package creational.builder.carbuilder;

/**
 * Created by anurag on 12/6/16.
 */
public class Car implements CarPlan{
    private String base;
    private String wheels;
    private String engine;
    private String mirror;
    private String body;

    @Override
    public void setBase(String base) {
        this.base = base;
    }

    @Override
    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setMirror(String mirror) {
        this.mirror = mirror;
    }

    @Override
    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString()
    {
        return String.format("(%s,%s,%s,%s,%s)",base,wheels,engine,mirror,body);
    }
}

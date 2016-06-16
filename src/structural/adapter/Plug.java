package structural.adapter;

/**
 * Created by anurag on 19/6/16.
 */
public class Plug {
    private String specification;
    protected String getInput(){
        return specification;
    }
    public Plug(){
        specification = "3-Pin";
    }

}

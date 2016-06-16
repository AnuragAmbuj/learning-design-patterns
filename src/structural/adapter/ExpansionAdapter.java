package structural.adapter;

/**
 * Created by anurag on 19/6/16.
 */
public class ExpansionAdapter extends Plug implements Socket {

    private Plug plug;
    public ExpansionAdapter(){
        plug = new Plug();
    }
    public ExpansionAdapter(Plug plug){
        this.plug = plug;
    }
    @Override
    public String getInput() {
        String input = super.getInput();
        input = input + " power converted to 2 Pin";
        return input;
    }
}

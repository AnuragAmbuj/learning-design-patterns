package structural.adapter;

/**
 * Created by anurag on 19/6/16.
 */
public class Client {
    private Socket socket;
    public void functionTest()
    {
        socket = new ExpansionAdapter();
        socket.getInput();
    }
}

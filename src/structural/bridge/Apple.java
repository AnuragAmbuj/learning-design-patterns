package structural.bridge;

/**
 * Created by anurag on 19/6/16.
 */
public class Apple implements TV {
    @Override
    public void powerOn() {
        System.out.println("TODO: Apple specigic TV On Code");
    }

    @Override
    public void powerOff() {
        System.out.println("TODO: Apple specigic TV On Code");
    }

    @Override
    public void changeChannel(int channelNumber) {
        System.out.println("Changed to channel number:"+channelNumber);
    }
}

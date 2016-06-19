package structural.bridge;

/**
 * Created by anurag on 19/6/16.
 */
public class Google implements TV {
    @Override
    public void powerOn() {
        System.out.println("TODO: Google specigic TV On Code");
    }

    @Override
    public void powerOff() {
        System.out.println("TODO: Google specigic TV Off Code");
    }

    @Override
    public void changeChannel(int channelNumber) {
        System.out.println("Changed to Channel number:"+channelNumber);
    }
}

package structural.bridge;

/**
 * Created by anurag on 19/6/16.
 */
public abstract class TVRemoteControl {
    private TV implementor;
    public  void powerOn(){
        implementor.powerOn();
    }
    public void powerOff(){
        implementor.powerOff();
    }
    public void setChannel(int channelNumber)
    {
        implementor.changeChannel(channelNumber);
    }
}

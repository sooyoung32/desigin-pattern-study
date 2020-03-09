package command.towbutton;

public class TwoButtonController {

    private Command power;
    private Command mute;

    public TwoButtonController(Command power, Command mute) {
        this.power = power;
        this.mute = mute;
    }

    public void button1() {
        power.execute();
    }

    public void button2() {
        mute.execute();
    }


}

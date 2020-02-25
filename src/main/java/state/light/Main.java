package state.light;

public class Main {

    public static void main(String[] args) {
        Light light = new Light();

        light.setState(On.getInstance());
        light.onButtonPushed();
        light.offButtonPushed();

        light.setState(Off.getInstance());
        light.onButtonPushed();
        light.offButtonPushed();

        light.setState(Sleeping.getInstance());
        light.onButtonPushed();
        light.offButtonPushed();
    }
}

package state.light;

public class On implements State {

    private static final On ON = new On();

    private On() {}

    public static final On getInstance() {
        return ON;
    }


    @Override
    public void onButtonPushed(Light light) {
        System.out.println("Sleeping On");
        light.setState(Sleeping.getInstance());
    }

    @Override
    public void offButtonPushed(Light light) {
        System.out.println("Light Off");
        light.setState(Off.getInstance());
    }
}

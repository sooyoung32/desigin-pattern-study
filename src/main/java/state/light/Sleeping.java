package state.light;

public class Sleeping implements State {

    private static final Sleeping SLEEPING = new Sleeping();

    private Sleeping() {
    }

    public static final Sleeping getInstance() {
        return SLEEPING;
    }

    @Override
    public void onButtonPushed(Light light) {
        System.out.println("Light ON");
        light.setState(On.getInstance());
    }

    @Override
    public void offButtonPushed(Light light) {
        System.out.println("Light OFF");
        light.setState(Off.getInstance());
    }
}

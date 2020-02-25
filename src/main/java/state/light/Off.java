package state.light;

public class Off implements State {

    private static final Off OFF = new Off();

    private Off() {
    }

    public static Off getInstance() {
        return OFF;
    }

    @Override
    public void onButtonPushed(Light light) {
        System.out.println("Light On");
        light.setState(On.getInstance());

    }

    @Override
    public void offButtonPushed(Light light) {
        System.out.println("No response");
    }
}

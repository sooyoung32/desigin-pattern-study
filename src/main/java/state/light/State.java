package state.light;

import state.light.Light;

public interface State {

    void onButtonPushed(Light light);

    void offButtonPushed(Light light);
}

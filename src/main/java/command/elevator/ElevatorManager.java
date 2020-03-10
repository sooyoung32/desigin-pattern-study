package command.elevator;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {

    private List<ElevatorController> controllers;

    public ElevatorManager(List<ElevatorController> controllers) {
        this.controllers = controllers;
    }


    public void addController(ElevatorController controller) {
        this.controllers.add(controller);
    }

    public void requestElevator(int destination, Direction direction) {
        controllers.get(selectElevator(destination, direction)).gotoFloor(destination);

    }

    private int selectElevator(int destination, Direction direction) {
        return 0;
    }
}

package command.elevator;

public class ElevatorController {

    private int id;

    private int currentFloor;


    public ElevatorController(int id) {
        this.id = id;
    }

    public void gotoFloor(int destination) {
        currentFloor = destination;
    }
}

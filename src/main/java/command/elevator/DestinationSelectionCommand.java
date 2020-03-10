package command.elevator;

public class DestinationSelectionCommand implements Command{

    private int destination;

    private ElevatorController controller;


    public DestinationSelectionCommand(int destination, ElevatorController controller) {
        this.destination = destination;
        this.controller = controller;
    }

    @Override
    public void execute() {
        controller.gotoFloor(destination);
    }
}

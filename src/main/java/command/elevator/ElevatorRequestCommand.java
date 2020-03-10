package command.elevator;

public class ElevatorRequestCommand implements Command{

   private int destination;

   private Direction direction;

   private ElevatorManager elevatorManager;

    public ElevatorRequestCommand(int destination, Direction direction, ElevatorManager elevatorManager) {
        this.destination = destination;
        this.direction = direction;
        this.elevatorManager = elevatorManager;
    }


    @Override
    public void execute() {
        elevatorManager.requestElevator(destination, direction);
    }
}

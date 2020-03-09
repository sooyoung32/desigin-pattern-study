package command.towbutton;

public class Client {

    public static void main(String[] args) {
        TV tv = new TV();
        PowerCommand powerCommand = new PowerCommand(tv);
        MuteCommand muteCommand = new MuteCommand(tv);
        TwoButtonController controller = new TwoButtonController(muteCommand,powerCommand);

        controller.button1();
        controller.button2();

        controller.button1();
        controller.button1();

        controller.button2();
        controller.button1();
    }
}

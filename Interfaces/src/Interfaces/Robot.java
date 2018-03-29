package Interfaces;

public class Robot implements Information, CognitiveProcesses {
    private int serial_number;

    public Robot(int serial_number) {
        this.serial_number = serial_number;
    }

    public void runRobot() {
        System.out.println("Robot which has serial number: " + serial_number + " already run");
    }

    @Override
    public void showInformation() {
        System.out.println("Serial number: " + serial_number);
    }

    @Override
    public void think() {
        System.out.println("Robot: " + serial_number + "thinks");

    }
}
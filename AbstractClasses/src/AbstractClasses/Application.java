package AbstractClasses;

public class Application {
    public static void main(String[] args) {

        //Machine machine = new Machine();
        Robot robot = new Robot();

        robot.assignSerialNumber(12345);
        System.out.println(robot.getSerialNumber());

        robot.run();
    }
}

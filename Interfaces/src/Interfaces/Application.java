package Interfaces;

/**
 * Created by Marcin Kożuch
 */

public class Application {
    public static void main(String[] args) {

        Robot robot = new Robot(123);
        robot.runRobot();

        Human human = new Human("NoName");
        human.breathe();

        Information[] information = new Information[]{human, robot};

        for (Information i : information) {
            i.showInformation();
        }

        Information robotInfo = new Robot(900);
        robotInfo.showInformation();

        CognitiveProcesses[] cognitiveProcesses = new CognitiveProcesses[]{human, robot};

        for(CognitiveProcesses i: cognitiveProcesses){
            i.think();
        }
    }

    public static void InterfaceTest(Information info){
        info.showInformation();
    }
}
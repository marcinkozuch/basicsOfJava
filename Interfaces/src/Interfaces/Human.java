package Interfaces;

public class Human implements Information, CognitiveProcesses {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void breathe() {
        System.out.println(name + " already breathe");
    }

    @Override
    public void showInformation() {
        System.out.println("Human name is: " + name);
    }

    @Override
    public void think() {
        System.out.println(name + "thinking now");
    }
}

// git test
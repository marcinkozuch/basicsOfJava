package AnonymousClasses;

public class Application {
    public static void main(String[] args) {

        Computer computer = new Computer() {
            @Override
            public void loadOperatingSystem() {
                System.out.println("Load sth other...");
            }
        };
        computer.loadOperatingSystem();
        Human human = new Human() {
            @Override
            public void think() {
                System.out.println("Human thinks...");
            }
        };

        human.think();
    }
}

class Computer {
    public void loadOperatingSystem() {
        System.out.println("Load...");
    }
}


interface Human {
    void think();
}

// Anonymous classe we use when we need extends functionality of class or we need implements methods of interface
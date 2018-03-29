package LambdaExpression;

public class Application {
    public static void main(String[] args) {

        Human human = new Human() {
            @Override
            public void think() {
                System.out.println("Human is thinking...");

            }
        };
        human.think();

        Corporation corporation = new Corporation();
        corporation.manage(new Human() {
            @Override
            public void think() {
                System.out.println("Human is thinking...");
            }
        });

        corporation.manage(() -> System.out.println("Human is thinking..."));
        // we can only use it if interface has only one method in other case we must use anonymous class
        // if we have a var in method think(int value) or think(int val, String s), we must replace () to ex. v or (v, ss)
    }
}

class Corporation {
    public void manage(Human h) {
        System.out.println("Management is active");
        h.think();
    }
}

interface Human {
    void think();
}

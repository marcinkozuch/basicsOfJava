package ReferenceToMethod;

public class App {
    public static void main(String[] args) {

        /*
        ExampleInterface exampleInterface = new ExampleInterface() {
            @Override
            public void callMethod() {
                Example.method();
            }
        };

        // simpler
        ExampleInterface exampleInterface = () -> Example.method();
        */
        // simplest
        ExampleInterface exampleInterface = Example::method;    // reference to static method
        exampleInterface.callMethod();

    }
}

class Example {
    public static void method() {
        System.out.println("This is an example");
    }
}

interface ExampleInterface {
    void callMethod();
}

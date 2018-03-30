package Exceptions;

public class Application {
    public static void main(String[] args) {

        try{
            connect(-2);
        } catch (IncorrectPort ex){
            System.out.println(ex.toString());
        }
    }

    public static void connect(int portNumber) throws IncorrectPort {
        if(portNumber <0){
            throw new IncorrectPort("Attempt to open port: " + portNumber);
        } else {
            System.out.println("Port: " + portNumber + " is open");
        }
    }
}

class IncorrectPort extends Exception{

    public IncorrectPort(String exDescription){
        super(exDescription);
    }
}

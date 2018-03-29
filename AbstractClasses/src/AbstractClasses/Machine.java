package AbstractClasses;

public abstract class Machine {

    private int serial_number;

    public void assignSerialNumber(int serial_number) {
        this.serial_number = serial_number;
    }

    public int getSerialNumber() {
        return serial_number;
    }

    public abstract void run(); // it must be implements by other class which "using" class Machine

}

// we cannot make object of this class cause it is abstract class
// in abstract class some methods are implements but some is not, then we must implements it in class which extends
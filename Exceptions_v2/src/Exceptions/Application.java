package Exceptions;

import java.io.IOException;

public class Application {
    public static void main(String[] args) {

        //throw new ArithmeticException();

        try {
            divTwoNumbers(5, 0);
        } catch (ArithmeticException ex) {
            System.out.println("Exception \"" + ex.toString() + "\" catched and handled");
        } catch (IOException e) {
            System.out.println("IO error");
        }
    }


    public static double divTwoNumbers(double a, double b) throws IOException {
        if (b == 0) {
            throw new ArithmeticException("Dividing by zero");
        } else {
            return a / b;
        }
    }
}

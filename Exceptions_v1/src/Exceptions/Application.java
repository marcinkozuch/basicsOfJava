package Exceptions;

public class Application {
    public static void main(String[] args) {

        try{
            int a = 10/0;
        } catch (ArithmeticException e){ // if we do not know what kind of exception we have, we can use Exception
            System.out.println("Exceptions " + e.toString() + " is catch");
        } catch(NullPointerException e){
            // handling next exceptions
        } finally {
            System.out.println("Operation..."); // it will happen even if we do not catch exception
        }

        System.out.println("Next instructions");

    }
}

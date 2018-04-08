package Data;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight;
        double height;
        double BMI;

        System.out.println("Get your weight in kg: ");
        weight = scanner.nextDouble();

        System.out.println("Get your height in cm: ");
        height = scanner.nextDouble();

        BMI = weight/Math.pow((height/100), 2);

        System.out.printf("Your BMI: %.2f \n\n", BMI);

        System.out.println("18.5 - underweight");
        System.out.println("18.5 - 24.99 - properly weight");
        System.out.println(">24.99 - overweight");
    }
}

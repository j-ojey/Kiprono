package aclass;
import java.util.Scanner;

public class Work {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int weight , height;
        double bmi; // Changed to double to handle decimal values

        System.out.print("Enter your height in Cm:");
        height = in.nextInt(); // Assign the input to the variable
        System.out.print("Enter your weight in kilograms:");
        weight = in.nextInt(); // Assign the input to the variable

        // Calculate BMI
        bmi = (double)weight / ((double)height / 100 * (double)height / 100);

        System.out.print("Your BMI is: " + bmi);
    }
}

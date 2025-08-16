import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter weight (in kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter height (in cm): ");
        double heightCm = sc.nextDouble();

        // Convert height to meters
        double heightM = heightCm / 100;

        // Formula: BMI = weight / (height * height)
        double bmi = weight / (heightM * heightM);

        // Determine BMI status
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Print result
        System.out.println("\n--- BMI Result ---");
        System.out.printf("BMI: %.2f\n", bmi);
        System.out.println("Status: " + status);
    }
}

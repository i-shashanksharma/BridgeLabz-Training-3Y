import java.util.*;
class BMIProgram {
    static Scanner sc = new Scanner(System.in);
    static double[][] inputData(int n) {
        double[][] data = new double[n][2];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }
        return data;
    }

    static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status;
        if (bmi <= 18.4) status = "Underweight";
        else if (bmi <= 24.9) status = "Normal";
        else if (bmi <= 39.9) status = "Overweight";
        else status = "Obese";
        return new String[]{String.format("%.2f", bmi), status};
    }

    static String[][] process(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(data[i][0]);
            String[] bmiStatus = calculateBMI(data[i][0], data[i][1]);
            result[i][2] = bmiStatus[0];
            result[i][3] = bmiStatus[1];
        }
        return result;
    }

    static void display(String[][] result) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", result[i][0], result[i][1], result[i][2], result[i][3]);
        }
    }

    public static void main(String[] args) {
        double[][] data = inputData(10);
        String[][] result = process(data);
        display(result);
    }
}

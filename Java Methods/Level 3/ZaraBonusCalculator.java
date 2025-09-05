import java.util.*;
public class ZaraBonusCalculator {
    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData(10);
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);
        displaySummary(employeeData, updatedData);
    }

    static int[][] generateEmployeeData(int count) {
        int[][] data = new int[count][2];
        for (int i = 0; i < count; i++) {
            int salary = 10000 + (int)(Math.random() * 90000);
            int years = 1 + (int)(Math.random() * 10);
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    static double[][] calculateBonusAndNewSalary(int[][] data) {
        double[][] result = new double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;
            result[i][0] = bonus;
            result[i][1] = newSalary;
        }
        return result;
    }

    static void displaySummary(int[][] oldData, double[][] newData) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.printf("%-10s %-10s %-12s %-12s %-12s\n", "Employee", "Salary", "YearsService", "Bonus", "NewSalary");
        for (int i = 0; i < oldData.length; i++) {
            int salary = oldData[i][0];
            int years = oldData[i][1];
            double bonus = newData[i][0];
            double newSalary = newData[i][1];
            totalOld += salary;
            totalBonus += bonus;
            totalNew += newSalary;
            System.out.printf("%-10d %-10d %-12d %-12.2f %-12.2f\n", i + 1, salary, years, bonus, newSalary);
        }
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-10s %-10.2f %-12s %-12.2f %-12.2f\n", "Total", totalOld, "", totalBonus, totalNew);
    }
}

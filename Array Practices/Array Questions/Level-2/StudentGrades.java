import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentages = new double[n];
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = j == 0 ? "Physics" : j == 1 ? "Chemistry" : "Maths";
                System.out.print("Enter marks in " + subject + ": ");
                int m = sc.nextInt();
                if (m < 0) {
                    System.out.println("Enter positive value");
                    j--;
                    continue;
                }
                marks[i][j] = m;
            }
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;
            if (percentages[i] >= 80) grades[i] = "A";
            else if (percentages[i] >= 70) grades[i] = "B";
            else if (percentages[i] >= 60) grades[i] = "C";
            else if (percentages[i] >= 50) grades[i] = "D";
            else if (percentages[i] >= 40) grades[i] = "E";
            else grades[i] = "R";
        }

        System.out.println("\n---- Student Report ----");
        System.out.printf("%-10s %-10s %-10s %-12s %-8s\n", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10d %-10d %-12.2f %-8s\n",
                    marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
    }
}

import java.util.*;
class StudentGrades {
    static Scanner sc = new Scanner(System.in);

    static int[][] generateMarks(int n) {
        Random rand = new Random();
        int[][] marks = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = 10 + rand.nextInt(90);
            }
        }
        return marks;
    }

    static double[][] calculateStats(int[][] marks) {
        int n = marks.length;
        double[][] stats = new double[n][3];
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100.0;
            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(perc * 100.0) / 100.0;
        }
        return stats;
    }

    static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double perc = stats[i][2];
            if (perc >= 80) grades[i] = "A";
            else if (perc >= 70) grades[i] = "B";
            else if (perc >= 60) grades[i] = "C";
            else if (perc >= 50) grades[i] = "D";
            else if (perc >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    static void display(int[][] marks, double[][] stats, String[] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-12s %-12s %-8s\n", 
                          "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-12.2f %-12.2f %-8s\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2],
                    stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = generateMarks(n);
        double[][] stats = calculateStats(marks);
        String[] grades = calculateGrades(stats);
        display(marks, stats, grades);
    }
}

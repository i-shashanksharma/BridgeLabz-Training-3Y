import java.util.Scanner;
public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Marks: ");
        double marks = Double.parseDouble(sc.nextLine());

        Student student = new Student(name, roll, marks);

        System.out.println("\nStudent Report:");
        student.display();
    }
}

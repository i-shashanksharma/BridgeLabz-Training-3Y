public class EmployeeMain {
    public static void main(String[] args) {
        Manager m = new Manager(201, "IT", 75000, "Project Manager");
        m.displayDetails();
        m.updateSalary(80000);
        System.out.println("Updated Salary: " + m.getSalary());
    }
}

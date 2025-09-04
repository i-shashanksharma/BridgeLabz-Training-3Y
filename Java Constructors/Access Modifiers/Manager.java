public class Manager extends Employee {
    String role;

    public Manager(int employeeID, String department, double salary, String role) {
        super(employeeID, department, salary);
        this.role = role;
    }

    public void displayDetails() {
        System.out.println("ID: " + employeeID + ", Department: " + department + ", Salary: " + getSalary() + ", Role: " + role);
    }
}

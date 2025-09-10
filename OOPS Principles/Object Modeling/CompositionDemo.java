import java.util.ArrayList;
class Employee {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void displayEmployee() {
        System.out.println("Employee: " + name + " | Role: " + role);
    }
}

class Department {
    private String deptName;
    private ArrayList<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String name, String role) {
        employees.add(new Employee(name, role));
    }

    public void displayDepartment() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.displayEmployee();
        }
        System.out.println();
    }
}

class Company {
    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void displayCompany() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.displayDepartment();
        }
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Company techCorp = new Company("TechCorp");

        Department devDept = new Department("Development");
        devDept.addEmployee("Shashank", "Java Developer");
        devDept.addEmployee("Mahima", "Frontend Engineer");

        Department hrDept = new Department("Human Resources");
        hrDept.addEmployee("Amit", "HR Manager");

        techCorp.addDepartment(devDept);
        techCorp.addDepartment(hrDept);

        techCorp.displayCompany();

        techCorp = null;
        System.gc();
        System.out.println("Company deleted. Departments and employees no longer accessible.");
    }
}
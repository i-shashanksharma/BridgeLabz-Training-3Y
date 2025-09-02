public class EmployeeMain {
    public static void employee_details(Employee emp) {
        System.out.println(emp.name);
        System.out.println(emp.id);
        System.out.println(emp.salary);
    }
    public static void main(String[] args) {
        Employee emp = new Employee("Shashank", 25, 10000);
        employee_details(emp);
    }
}

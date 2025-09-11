import java.util.ArrayList;
import java.util.List;
class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Faculty {
    private String name;
    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class University {
    private String name;
    private List<Department> departments;
    private List<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Department d : departments) {
            System.out.println("- " + d.getName());
        }
    }

    public void showFaculties() {
        System.out.println("Faculties in " + name + ":");
        for (Faculty f : faculties) {
            System.out.println("- " + f.getName());
        }
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        University uni = new University("Tech University");
        Department cs = new Department("Computer Science");
        Department mech = new Department("Mechanical Engineering");
        uni.addDepartment(cs);
        uni.addDepartment(mech);
        Faculty john = new Faculty("John Smith");
        Faculty mary = new Faculty("Mary Johnson");
        uni.addFaculty(john);
        uni.addFaculty(mary);
        uni.showDepartments();
        uni.showFaculties();
    }
}

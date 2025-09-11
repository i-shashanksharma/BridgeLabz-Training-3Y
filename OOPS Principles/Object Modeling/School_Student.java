import java.util.*;
class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.addCourse(this);
        }
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}

class Student {
    private String studentName;
    private List<Course> enrolledCourses;

    public Student(String studentName) {
        this.studentName = studentName;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public void enrollInCourse(Course course) {
        course.enrollStudent(this);
    }

    public void addCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
        }
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }
}

class School {
    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}

public class School_Student {
    public static void main(String[] args) {
        School school = new School("Springfield School");

        Student student1 = new Student("Shashank");
        Student student2 = new Student("Aarav");

        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Computer Science");

        school.addStudent(student1);
        school.addStudent(student2);

        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);

        System.out.println(student1.getStudentName() + " enrolled in:");
        for (Course c : student1.getEnrolledCourses()) {
            System.out.println("- " + c.getCourseName());
        }

        System.out.println(course1.getCourseName() + " has students:");
        for (Student s : course1.getEnrolledStudents()) {
            System.out.println("- " + s.getStudentName());
        }
    }
}
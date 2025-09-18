import java.util.*;
abstract class Person {
    protected int id;
    protected String name;
    protected String email;

    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public abstract String getRole();
}

class Student extends Person {
    private List<Course> enrolledCourses = new ArrayList<>();
    private Map<Course, String> results = new HashMap<>();

    public Student(int id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public String getRole() {
        return "Student";
    }

    public boolean enrollCourse(Course c) {
        if (enrolledCourses.size() >= UniversityRules.MAX_COURSES_PER_STUDENT) {
            System.out.println(name + " cannot enroll in more than " +
                    UniversityRules.MAX_COURSES_PER_STUDENT + " courses.");
            return false;
        }
        enrolledCourses.add(c);
        System.out.println(name + " enrolled in " + c.getCourseCode());
        return true;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setResult(Course c, String grade) {
        results.put(c, grade);
    }

    public Map<Course, String> getResults() {
        return results;
    }
}

class Professor extends Person {
    private List<Course> teachingCourses = new ArrayList<>();

    public Professor(int id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public String getRole() {
        return "Professor";
    }

    public void assignCourse(Course c) {
        teachingCourses.add(c);
        System.out.println(name + " assigned to teach " + c.getCourseCode());
    }

    public List<Course> getTeachingCourses() {
        return teachingCourses;
    }
}

interface Evaluatable {
    void conductExam();
    void evaluateStudent(Student s);
}

abstract class Course implements Evaluatable {
    private final String courseCode;
    protected String title;
    protected Syllabus syllabus;

    public Course(String courseCode, String title) {
        this.courseCode = courseCode;
        this.title = title;
        this.syllabus = new Syllabus("Syllabus for " + title);
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getTitle() {
        return title;
    }

    public void showSyllabus() {
        syllabus.display();
    }
}

class TheoryCourse extends Course {
    public TheoryCourse(String code, String title) {
        super(code, title);
    }

    @Override
    public void conductExam() {
        System.out.println("Written exam for " + title);
    }

    @Override
    public void evaluateStudent(Student s) {
        s.setResult(this, "A");
        System.out.println("Evaluated " + s.name + " in " + title + ": Grade A");
    }
}

class LabCourse extends Course {
    public LabCourse(String code, String title) {
        super(code, title);
    }

    @Override
    public void conductExam() {
        System.out.println("Lab exam for " + title);
    }

    @Override
    public void evaluateStudent(Student s) {
        s.setResult(this, "B");
        System.out.println("Evaluated " + s.name + " in " + title + ": Grade B");
    }
}

class Syllabus {
    private String content;

    public Syllabus(String content) {
        this.content = content;
    }

    public void display() {
        System.out.println("Syllabus: " + content);
    }
}

class UniversityRules {
    public static final int MAX_COURSES_PER_STUDENT = 5;
}

class Transcript {
    public static void generateTranscript(Student s) {
        System.out.println("\nTranscript for " + s.name + ":");
        for (Course c : s.getEnrolledCourses()) {
            String grade = s.getResults().getOrDefault(c, "Not Evaluated");
            System.out.println(c.getCourseCode() + " - " + c.getTitle() + " : " + grade);
        }
    }
}

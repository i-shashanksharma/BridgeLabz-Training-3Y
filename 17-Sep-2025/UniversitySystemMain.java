public class UniversitySystemMain {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Alice", "alice@uni.edu");
        Professor p1 = new Professor(101, "Dr. Bob", "bob@uni.edu");

        Course c1 = new TheoryCourse("CS101", "Data Structures");
        Course c2 = new LabCourse("CS102", "Programming Lab");

        p1.assignCourse(c1);
        p1.assignCourse(c2);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        c1.conductExam();
        c1.evaluateStudent(s1);

        c2.conductExam();
        c2.evaluateStudent(s1);

        Transcript.generateTranscript(s1);
    }
}

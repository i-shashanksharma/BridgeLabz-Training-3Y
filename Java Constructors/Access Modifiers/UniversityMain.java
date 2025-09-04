public class UniversityMain {
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(50, "Harris", 8.7, "Computer Science");
        pg.displayDetails();
        pg.setCGPA(9.0);
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }
}

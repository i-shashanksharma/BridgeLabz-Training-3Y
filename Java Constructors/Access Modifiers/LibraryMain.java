public class LibraryMain {
    public static void main(String[] args) {
        EBook ebook = new EBook("123-456", "Java Basics", "James Gosling", "PDF");
        ebook.displayDetails();
        ebook.setAuthor("Updated Author");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}

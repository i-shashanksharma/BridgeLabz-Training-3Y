public class LibraryBookMain {
    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook("Effective Java", "Joshua Bloch", 800, true);
        lb.borrowBook();
        lb.borrowBook();
    }
}

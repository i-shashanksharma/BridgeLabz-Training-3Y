public class EBook extends Book {
    String format;

    public EBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    public void displayDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor() + ", Format: " + format);
    }
}

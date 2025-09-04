public class Book {
    String title;
    String author;
    double price;

    public Book() {
        this.title = "The Hidden Pool";
        this.author = "Ruskin Bond";
        this.price = 100.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}
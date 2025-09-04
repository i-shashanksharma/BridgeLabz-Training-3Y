public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Programming", "James Gosling", 500);

        System.out.println(b1.title + " - " + b1.author + " - " + b1.price);
        System.out.println(b2.title + " - " + b2.author + " - " + b2.price);
    }
}

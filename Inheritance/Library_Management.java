public class Library_Management {
    public static void main(String[] args) {
        Author a1 = new Author("The Alchemist", 1988, "Paulo Coelho", "Brazilian lyricist and novelist, best known for his novel The Alchemist.");
        Author a2 = new Author("1984", 1949, "George Orwell", "English novelist, essayist, journalist, and critic.");

        a1.displayInfo();
        a2.displayInfo();
    }
}

class Book {
    String title;
    int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Year: " + publicationYear);
    }
}

class Author extends Book {
    String name;
    String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + title + ", Year: " + publicationYear + ", Author: " + name + ", Bio: " + bio);
    }
}

// Book class using OOP concepts
class Book {

    private String title;
    private String author;
    private String ISBN;
    private int publicationYear;
    private String genre;
    private boolean availabilityStatus;

    // Constructor
    public Book(String title, String author, String ISBN,
                int publicationYear, String genre, boolean availabilityStatus) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.availabilityStatus = availabilityStatus;
    }

    // Getter for publication year
    public int getPublicationYear() {
        return publicationYear;
    }

    // Method to display book information
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Genre: " + genre);
        System.out.println("Available: " + (availabilityStatus ? "Yes" : "No"));
        System.out.println("--------------------------------");
    }
}

// Main class
public class LibraryManagement {

    public static void main(String[] args) {

        // Creating book objects
        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien",
                "978-0547928227", 1937, "Fantasy", true);

        Book book2 = new Book("1984", "George Orwell",
                "978-0451524935", 1949, "Dystopian", false);

        Book book3 = new Book("The Da Vinci Code", "Dan Brown",
                "978-0307474278", 2003, "Mystery", true);

        Book book4 = new Book("Harry Potter and the Goblet of Fire", "J.K. Rowling",
                "978-0439139601", 2000, "Fantasy", true);

        // Storing books in an array
        Book[] books = { book1, book2, book3, book4 };

        // Books published before 2000
        System.out.println("Books published before 2000:");
        for (Book book : books) {
            if (book.getPublicationYear() < 2000) {
                book.displayBookInfo();
            }
        }

        // Books published after 2000
        System.out.println("Books published after 2000:");
        for (Book book : books) {
            if (book.getPublicationYear() > 2000) {
                book.displayBookInfo();
            }
        }
    }
}

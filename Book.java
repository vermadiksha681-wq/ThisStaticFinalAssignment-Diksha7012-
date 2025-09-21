/* Create a Book class to manage library books with the following features:
Static:
○       A static variable libraryName shared across all books.
○       A static method displayLibraryName() to print the library name.
This:
○       Use this to initialize title, author, and isbn in the constructor.
Final:
○       Use a final variable isbn to ensure the unique identifier of a book cannot be changed.
Instanceof:
○       Verify if an object is an instance of the Book class before displaying its details.
*/
public class Book {
    static String libraryName = "city library";
    final String isbn;
    String title;
    String author;

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("librray name:  " + libraryName);
            System.out.println("isbn:  " + isbn);
            System.out.println("title:  " + title);
            System.out.println("author:  " + author);
        }
    }

    static void displayLibraryName() {
        System.out.println("librray name: " + libraryName);
    }

    public static void main(String args[]) {
        Book obj = new Book("110", "mybook", "diksha");
        Book obj2 = new Book("112", "mybb", "james");
        obj.displayBookDetails();
        obj2.displayBookDetails();
        Book.displayLibraryName();
    }

}
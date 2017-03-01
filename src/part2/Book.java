package part2;

/**
 * Defines the attributes and methods of a book object. Add the getters,
 * setters. Add a toString methods that prints the book title, author, and
 * genre.
 *
 * @author Your name here
 */
public abstract class Book {
//PARENT CLASS

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public abstract String getGenre();

}

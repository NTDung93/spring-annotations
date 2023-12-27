package ntd.javaguides.springannotations.beans;

import lombok.Data;

@Data
public class Book {
    private String name;
    private String author;
    private String publisher;
    private String isbn;

    public Book() {
    }

    public Book(String name, String author, String publisher, String isbn) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", author=" + author + ", publisher=" + publisher + ", isbn=" + isbn + "]";
    }
}

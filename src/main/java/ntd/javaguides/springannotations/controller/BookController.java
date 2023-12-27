package ntd.javaguides.springannotations.controller;

import ntd.javaguides.springannotations.beans.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/api")
public class BookController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping(value = {"/book", "/java", "/java/book"})
    public Book book() {
        Book book = new Book("Java", "Nguyen Trong Duy", "FPT", "123456789");
        return book;
    }

    @PostMapping(value = "/book/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
        System.out.println(book.getPublisher());
        System.out.println(book.getIsbn());
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @PutMapping(value = "/book/update/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable int id, @RequestBody Book book) {
        System.out.println(id);
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
        return ResponseEntity.ok(book);
    }

    @DeleteMapping(value = "/book/delete/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable int id) {
        System.out.println(id);
        return ResponseEntity.ok("Deleted");
    }
}

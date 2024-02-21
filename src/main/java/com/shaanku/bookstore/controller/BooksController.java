package com.shaanku.bookstore.controller;

import com.shaanku.bookstore.entity.AvailableBooks;
import com.shaanku.bookstore.modal.BookDetails;
import com.shaanku.bookstore.service.BookService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
@CrossOrigin("*")
public class BooksController {

    @Autowired
    BookService bookService;

    @PostMapping("create-book")
    public ResponseEntity createBook(@RequestBody BookDetails bookDetails) {
        return bookService.createBook(bookDetails);
    }

    @PutMapping("update-Book/{id}")
    public ResponseEntity updateBook(@PathVariable Integer id, @RequestBody BookDetails bookDetails) {
        return bookService.updateBook(new AvailableBooks(id, bookDetails.getName(), bookDetails.getAuthor(), bookDetails.getPrice()));
    }

    @GetMapping("all-books")
    public ResponseEntity getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping("add-to-my-list")
    public ResponseEntity addToMyList(@RequestBody BookDetails bookDetails) {
        return bookService.addToMyList(bookDetails);
    }

    @GetMapping("get-all-my-books")
    public ResponseEntity getMyBooks() {
        return bookService.getMyBooks();
    }

    @DeleteMapping("delete-my-list/{id}")
    public ResponseEntity deleteMyBookRecord(@PathVariable Integer id) {
        return bookService.deleteMyBookRecord(id);
    }

}

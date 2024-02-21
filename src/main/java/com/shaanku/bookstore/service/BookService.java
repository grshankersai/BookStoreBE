package com.shaanku.bookstore.service;

import com.shaanku.bookstore.entity.AvailableBooks;
import com.shaanku.bookstore.modal.BookDetails;
import org.springframework.http.ResponseEntity;

public interface BookService {
    public ResponseEntity createBook(BookDetails bookDetails);

    ResponseEntity getAllBooks();

    ResponseEntity addToMyList(BookDetails bookDetails);

    ResponseEntity getMyBooks();

    ResponseEntity deleteMyBookRecord(Integer id);

    ResponseEntity updateBook(AvailableBooks availableBook);
}

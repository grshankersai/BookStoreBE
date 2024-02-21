package com.shaanku.bookstore.service.implementation;

import com.shaanku.bookstore.entity.AvailableBooks;
import com.shaanku.bookstore.entity.MyBooks;
import com.shaanku.bookstore.modal.BookDetails;
import com.shaanku.bookstore.repository.BooksDAO;
import com.shaanku.bookstore.repository.MyBooksDAO;
import com.shaanku.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BooksDAO booksDAO;

    @Autowired
    MyBooksDAO myBooksDAO;

    @Override
    public ResponseEntity createBook(BookDetails bookDetails) {
        AvailableBooks availableBooks = new AvailableBooks(bookDetails.getName(), bookDetails.getAuthor(), bookDetails.getPrice());
        booksDAO.save(availableBooks);
        return new ResponseEntity("Success", HttpStatus.OK);
    }

    @Override
    public ResponseEntity getAllBooks() {
        return new ResponseEntity(booksDAO.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity addToMyList(BookDetails bookDetails) {
        MyBooks myBook = new MyBooks(bookDetails.getName(), bookDetails.getAuthor(), bookDetails.getPrice());
        myBooksDAO.save(myBook);
        return new ResponseEntity("Success", HttpStatus.OK);
    }

    @Override
    public ResponseEntity getMyBooks() {

        return new ResponseEntity(myBooksDAO.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity deleteMyBookRecord(Integer id) {
        myBooksDAO.deleteById(id);
        return new ResponseEntity("Deleted Successfully", HttpStatus.OK);
    }

    @Override
    public ResponseEntity updateBook(AvailableBooks availableBook) {
        booksDAO.save(availableBook);
        return new ResponseEntity("Updated", HttpStatus.OK);
    }


}

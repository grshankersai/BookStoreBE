package com.shaanku.bookstore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class AvailableBooks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String bookName;
    String author;

    public AvailableBooks(String bookName, String author, String price) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    String price;

    public AvailableBooks(Integer id, String bookName, String author, String price) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }
}

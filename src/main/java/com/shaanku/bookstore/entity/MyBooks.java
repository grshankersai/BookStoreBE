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
public class MyBooks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String bookName;
    String author;
    String price;


    public MyBooks(String bookName, String author, String price) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }
}

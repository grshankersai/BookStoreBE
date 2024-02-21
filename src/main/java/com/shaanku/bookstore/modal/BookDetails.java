package com.shaanku.bookstore.modal;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
public class BookDetails {
    String name;
    String author;
    String price;

    public BookDetails(String name, String author, String price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
}

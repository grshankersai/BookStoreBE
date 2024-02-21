package com.shaanku.bookstore.repository;

import com.shaanku.bookstore.entity.AvailableBooks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksDAO extends JpaRepository<AvailableBooks,Integer> {
}

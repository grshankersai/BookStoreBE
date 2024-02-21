package com.shaanku.bookstore.repository;

import com.shaanku.bookstore.entity.MyBooks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyBooksDAO extends JpaRepository<MyBooks,Integer> {
}

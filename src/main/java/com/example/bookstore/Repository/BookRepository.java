package com.example.bookstore.Repository;

import com.example.bookstore.Models.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Books,Long> {
}

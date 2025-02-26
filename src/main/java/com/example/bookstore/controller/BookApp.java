package com.example.bookstore.controller;

import com.example.bookstore.Models.Books;
import com.example.bookstore.Repository.BookRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class BookApp {
    @Autowired
    private BookRepository bookRepository;
    @Transactional
    @PostMapping("/bookEntry")
    public ResponseEntity<Map<String,String>> bookEntry(@RequestBody Books book){
        Books bookObj = bookRepository.save(book);
        Map<String,String> response = new HashMap<>();
        response.put("Status","Book Added");
        return ResponseEntity.ok(response);
    }
    @GetMapping("/viewBook")
    public ResponseEntity<List<Books>>bookList(){
        List<Books> books = bookRepository.findAll();
        return ResponseEntity.ok(books);
    }
}

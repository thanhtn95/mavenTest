package com.example.demomaven.controller;

import com.example.demomaven.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(value = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/book/")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

        @GetMapping("testSum")
    public ResponseEntity<List<Object>> testSum() {
        return new ResponseEntity<>(bookRepository.getSumPrice(), HttpStatus.OK);
    }

    @GetMapping("testUnion")
    public ResponseEntity<List<Object>> testUnion() {
        return new ResponseEntity<>(bookRepository.testUnion(), HttpStatus.OK);
    }
}

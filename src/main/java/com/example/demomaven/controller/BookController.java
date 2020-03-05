package com.example.demomaven.controller;

import com.example.demomaven.model.Book;
import com.example.demomaven.repository.BookRepository;
import com.example.demomaven.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    @Autowired
    @Qualifier("BS1")
    private BookService bookService;

    @GetMapping("testSum")
    public ResponseEntity<List<Object>> testSum() {
        return new ResponseEntity<>(bookRepository.getSumPrice(), HttpStatus.OK);
    }

    @GetMapping("testUnion")
    public ResponseEntity<List<Object>> testUnion() {
        return new ResponseEntity<>(bookRepository.testUnion(), HttpStatus.OK);
    }

    @GetMapping("testQL")
    public ResponseEntity<List<Book>> testQL() {
            return new ResponseEntity<>(bookService.findAll(), HttpStatus.OK);
    }
}

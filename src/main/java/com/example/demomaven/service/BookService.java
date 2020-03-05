package com.example.demomaven.service;

import com.example.demomaven.model.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    void save(Book book);
    void delete(long id);
}

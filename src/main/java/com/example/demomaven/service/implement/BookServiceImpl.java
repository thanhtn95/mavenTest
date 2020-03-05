package com.example.demomaven.service.implement;

import com.example.demomaven.model.Book;
import com.example.demomaven.repository.BookRepository;
import com.example.demomaven.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void delete(long id) {
        bookRepository.deleteById(id);
    }
}

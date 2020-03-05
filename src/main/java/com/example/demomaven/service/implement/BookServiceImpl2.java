package com.example.demomaven.service.implement;

import com.example.demomaven.model.Book;
import com.example.demomaven.service.BookService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("BS2")
public class BookServiceImpl2 implements BookService {
    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public void save(Book book) {

    }

    @Override
    public void delete(long id) {

    }
}

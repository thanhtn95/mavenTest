package com.example.demomaven.repository;

import com.example.demomaven.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    @Query("SELECT b.name, sum (b.price) FROM Book b join Categories c on b.category.id = c.id group by b.id, b.name,b.price having b.price > 500")
    List<Object> getSumPrice();
    @Query(value = "SELECT  * FROM books union all SELECT  * FROM diskes", nativeQuery = true)
    List<Object> testUnion();
}

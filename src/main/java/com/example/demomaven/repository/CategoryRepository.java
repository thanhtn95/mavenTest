package com.example.demomaven.repository;

import com.example.demomaven.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Categories, Long> {
    @Query(value = "SELECT * from categories where name = :name", nativeQuery = true)
    List<Categories> getCategoriesJav(@Param("name") String name);
}

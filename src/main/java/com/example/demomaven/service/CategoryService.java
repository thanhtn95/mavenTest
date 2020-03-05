package com.example.demomaven.service;

import com.example.demomaven.model.Categories;

import java.util.List;

public interface CategoryService {
    List<Categories> findAll();
    void save(Categories categories);
    void delete(long id);
}

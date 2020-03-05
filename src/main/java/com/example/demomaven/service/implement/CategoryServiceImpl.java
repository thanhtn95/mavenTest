package com.example.demomaven.service.implement;

import com.example.demomaven.model.Categories;
import com.example.demomaven.repository.CategoryRepository;
import com.example.demomaven.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public List<Categories> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public void save(Categories categories) {
        categoryRepository.save(categories);
    }

    @Override
    public void delete(long id) {
        categoryRepository.deleteById(id);
    }
}

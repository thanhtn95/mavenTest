package com.example.demomaven.controller;

import com.example.demomaven.model.Categories;
import com.example.demomaven.repository.CategoryRepository;
import com.example.demomaven.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Cate/")
@CrossOrigin("*")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("getCategoryList")
    public ResponseEntity<List<Categories>> getFullCategoryList() {
        List<Categories> categories = categoryService.findAll();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @PostMapping("newCategory")
    public ResponseEntity<?> saveNewCategory(@RequestBody Categories categories) {
        try {
            categoryService.save(categories);
            return new ResponseEntity<>("Added", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @PutMapping("updateCategory")
    public ResponseEntity<?> updateCategory(@RequestBody Categories categories) {
        try {
            categoryService.save(categories);
            return new ResponseEntity<>("Updated", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @DeleteMapping("deleteCategory/{id}")
    public ResponseEntity<?> deleteCategory(@PathVariable("id") long id) {
        try {
            categoryService.delete(id);
            return new ResponseEntity<>("Deleted", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @GetMapping("test/{name}")
    public ResponseEntity<List<Categories>> test(@PathVariable("name") String name) {
        List<Categories> categories = categoryRepository.getCategoriesJav(name);
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
}

package com.example.demomaven.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String author;
    private String test;
    private double price;
    @ManyToOne(targetEntity = Categories.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Categories category;
    public Book() {
    }
}

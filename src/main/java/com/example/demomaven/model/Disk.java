package com.example.demomaven.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "diskes")
public class Disk {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String code;
    private String description;
    private double price;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Categories categories;
    public Disk() {
    }
}

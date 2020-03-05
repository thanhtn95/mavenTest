package com.example.demomaven.repository;

import com.example.demomaven.model.Disk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DiskRepository extends JpaRepository<Disk, Long> {
    @Query(value = "SELECT c,d from Disk d join Categories c on d.categories.id = c.id")
    List<Object> testJoin();
}

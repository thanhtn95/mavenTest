package com.example.demomaven.service;
import com.example.demomaven.model.Disk;

import java.util.List;

public interface DiskService {
    List<Disk> findAll();
    void save(Disk disk);
    void delete(long id);
    List<Object> testJoin();
}

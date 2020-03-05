package com.example.demomaven.service.implement;

import com.example.demomaven.model.Disk;
import com.example.demomaven.repository.DiskRepository;
import com.example.demomaven.service.DiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Service
public class DiskServiceImpl implements DiskService {
    @Autowired
    private DiskRepository diskRepository;
    @Autowired
    private EntityManager em;

    @Override
    public List<Disk> findAll() {
        return diskRepository.findAll();
    }

    @Override
    public void save(Disk disk) {
        diskRepository.save(disk);
    }

    @Override
    public void delete(long id) {
        diskRepository.deleteById(id);
    }

    @Override
    public List<Object> testJoin() {
        Query query = em.createQuery("SELECT * FROM diskes JOIN categories ON diskes.category_id = categories.id");
        List<Object> objects = query.getResultList();
        return objects;
    }
}

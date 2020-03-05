package com.example.demomaven.controller;

import com.example.demomaven.model.Disk;
import com.example.demomaven.repository.DiskRepository;
import com.example.demomaven.service.DiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/disk/")
public class DiskController {
    @Autowired
    private DiskService diskService;
    @Autowired
    private DiskRepository diskRepository;

    @GetMapping("join")
    public ResponseEntity<List<Object>> getJoin() {
        return new ResponseEntity<>(diskRepository.testJoin(), HttpStatus.ACCEPTED);
    }

    @GetMapping("diskList")
    public ResponseEntity<List<Disk>> getFullDiskList() {
        return new ResponseEntity<>(diskService.findAll(), HttpStatus.OK);
    }

    @PostMapping("newDisk")
    public ResponseEntity<?> addNewDisk(@RequestBody Disk disk) {
        try {
            diskService.save(disk);
            return new ResponseEntity<>("Added", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Fail", HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @DeleteMapping("delDisk/{id}")
    public ResponseEntity<?> deleteDisk(@PathVariable("id") long id) {
        try {
            diskService.delete(id);
            return new ResponseEntity<>("Deleted", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Fail", HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @PutMapping("updateDisk")
    public ResponseEntity<?> updateDisk(@RequestBody Disk disk) {
        try {
            diskService.save(disk);
            return new ResponseEntity<>("Updated", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Fail", HttpStatus.NOT_ACCEPTABLE);
        }
    }


}

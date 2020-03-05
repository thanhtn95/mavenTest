package com.example.demomaven.repository;

import com.example.demomaven.model.ERole;
import com.example.demomaven.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}

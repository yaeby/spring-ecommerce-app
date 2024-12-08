package com.c8a.dream_shops.repository;

import com.c8a.dream_shops.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String roleAdmin);
}

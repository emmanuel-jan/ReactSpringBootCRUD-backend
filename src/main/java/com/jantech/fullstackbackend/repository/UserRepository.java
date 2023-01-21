package com.jantech.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jantech.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}

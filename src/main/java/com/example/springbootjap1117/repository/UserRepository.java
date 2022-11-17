package com.example.springbootjap1117.repository;

import com.example.springbootjap1117.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

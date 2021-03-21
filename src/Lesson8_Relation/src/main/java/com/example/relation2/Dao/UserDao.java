package com.example.relation2.Dao;

import com.example.relation2.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface UserDao extends JpaRepository<User, Integer> {
}

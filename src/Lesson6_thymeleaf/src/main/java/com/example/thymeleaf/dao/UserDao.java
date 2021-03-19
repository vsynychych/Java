package com.example.thymeleaf.dao;

import com.example.thymeleaf.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface UserDao extends JpaRepository<User, Integer> {

}

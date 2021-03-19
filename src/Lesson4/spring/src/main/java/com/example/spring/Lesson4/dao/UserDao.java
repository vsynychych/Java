package com.example.spring.Lesson4.dao;


import com.example.spring.Lesson4.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface UserDao extends JpaRepository<User,Integer> {
}

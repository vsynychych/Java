package com.example.services.Dao;

import com.example.services.Models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface CarDAO extends JpaRepository<Car, Integer> {
}

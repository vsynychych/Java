package com.example.thymeleaf.dao;


import com.example.thymeleaf.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface CarDao extends JpaRepository<Car,Integer> {


}

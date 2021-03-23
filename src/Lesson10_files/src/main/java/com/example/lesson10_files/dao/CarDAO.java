package com.example.lesson10_files.dao;

import com.example.lesson10_files.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDAO extends JpaRepository<Car,Integer> {
}

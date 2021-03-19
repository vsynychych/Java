package com.example.spring.Lesson4.dao;

import com.example.spring.Lesson4.models.Calculator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalculatorDao extends JpaRepository<Calculator, Integer> {

}

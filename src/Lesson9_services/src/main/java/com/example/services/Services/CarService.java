package com.example.services.Services;


import com.example.services.Models.Car;

import java.util.List;

public interface CarService {

    void save(Car car);

    List<Car> findAll();

}

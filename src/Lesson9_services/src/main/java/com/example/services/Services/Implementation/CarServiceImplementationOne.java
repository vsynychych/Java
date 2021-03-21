package com.example.services.Services.Implementation;

import com.example.services.Dao.CarDAO;
import com.example.services.Models.Car;
import com.example.services.Services.CarService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarServiceImplementationOne implements CarService {

    private final CarDAO carDAO;

    @Override
    public void save(Car car) {
        carDAO.save(car);
    }

    @Override
    public List<Car> findAll() {
      return carDAO.findAll();
    }
}

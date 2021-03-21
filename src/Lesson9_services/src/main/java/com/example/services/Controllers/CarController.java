package com.example.services.Controllers;

import com.example.services.Models.Car;
import com.example.services.Services.CarService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    private final CarService carService;

    public CarController(@Qualifier("carServiceImplementationOne") CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/save")
    public void saveCar(){
        Car car = new Car();
        car.setModel("BMW");
        carService.save(car);
        carService.save(new Car("Audi"));
    }


    @PostMapping("/find")
    public List<Car> findAll (){
        return carService.findAll();
    }

}

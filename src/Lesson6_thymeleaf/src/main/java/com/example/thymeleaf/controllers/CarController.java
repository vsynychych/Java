package com.example.thymeleaf.controllers;


import com.example.thymeleaf.dao.CarDao;
import com.example.thymeleaf.models.Car;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@AllArgsConstructor
@Controller
public class CarController {

    private final CarDao carDao;

    @PostMapping("/save")
    public String saveCar(@RequestParam String producer,
                          @RequestParam String modell,
                          @RequestParam Integer year,
                          @RequestParam String color,
                          Model model) {
        carDao.save(new Car(producer, modell, year, color));
        Model cars = model.addAttribute("cars", carDao.findAll());
        System.out.println(cars);
        return "cars.html";
    }

    @GetMapping("/cars/{id}")
    public String car(@PathVariable int id,
                      Model model) {
        Car one = carDao.getOne(id);
        model.addAttribute("car", one);
        return "car.html";
    }


}








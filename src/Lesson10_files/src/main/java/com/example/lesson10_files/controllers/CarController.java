package com.example.lesson10_files.controllers;

import com.example.lesson10_files.dao.CarDAO;
import com.example.lesson10_files.models.Car;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@AllArgsConstructor
@RequestMapping("/car")
public class CarController {
    private final CarDAO carDAO;

    @PostMapping("/save")
    public Car save(@RequestParam String model,
                    @RequestParam MultipartFile image) {
        String pathToImage = System.getProperty("user.home") + File.separator + "picturesFromJava" + File.separator + image.getOriginalFilename();
        try {
            image.transferTo(new File(pathToImage));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Car car = new Car();
        car.setModel(model);

        String originalFilename = image.getOriginalFilename();
        car.setImage(originalFilename);
        return carDAO.save(car);
    }

    @GetMapping("/image/{id}")
    public Car getImage(@PathVariable int id) {
      return carDAO.getOne(id);
    }

}

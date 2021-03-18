package com.example.thymeleaf.models;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String producer;
    private String model;
    private int year;
    private String color;

    public Car(String producer, String model, int year, String color) {
        this.producer = producer;
        this.model = model;
        this.year = year;
        this.color = color;
    }
}

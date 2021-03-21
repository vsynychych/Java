package com.example.relation2.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = "users")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String model;
    private int year;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "cars")
    @JsonIgnore
    private List<User> users = new ArrayList<>();

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public Car(String model, int year, List<User> users) {
        this.model = model;
        this.year = year;
        this.users = users;
    }
}

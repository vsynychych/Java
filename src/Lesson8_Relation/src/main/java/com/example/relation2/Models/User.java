package com.example.relation2.Models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = {"skills", "cars"})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_skills")
    private List<Skills> skills = new ArrayList<>();



    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_cars",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "car_id")})
    private List<Car> cars = new ArrayList<>();


    public User(List<Car> cars) {
        this.cars = cars;
    }


    public User(String name, int age, List<Skills> skills) {
        this.name = name;
        this.age = age;
        this.skills = skills;
    }

    public User(List<Skills> skills, List<Car> cars) {
        this.skills = skills;
        this.cars = cars;
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

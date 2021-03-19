package com.example.spring.Lesson4.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int id;
    String name;

    public User(String name) {
        this.name = name;
    }
}

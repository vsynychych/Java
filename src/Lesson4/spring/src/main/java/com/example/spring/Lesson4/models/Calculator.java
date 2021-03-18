package com.example.spring.Lesson4.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Calculator {
    @Id
    @GeneratedValue
    private int id;
    private int a;
    private int b;
    String action;

    public Calculator(int a, int b, String action) {
        this.a = a;
        this.b = b;
        this.action = action;
    }

}

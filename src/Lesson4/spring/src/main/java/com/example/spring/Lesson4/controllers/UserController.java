package com.example.spring.Lesson4.controllers;


import com.example.spring.Lesson4.dao.UserDao;
import com.example.spring.Lesson4.models.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    UserDao userDao;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/user")
    public User getUser() {
        User user = new User();
        user.setId(10);
        user.setName("Oleg");
        return user;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> userList = Arrays.asList(
                new User("Alex"),
                new User("Max"),
                new User("Taras")
        );
        return userList;
    }

    @GetMapping("/saveUsers")
    public void saveUsers() {
        User user = new User("Lilia");
        userDao.save(user);
    }

    @GetMapping("/save")
    public void saveUsers(@RequestParam String newName) {
        User user = new User(newName);
        userDao.save(user);
    }

    @GetMapping("/allUsers")
    public List<User> listUser() {
        return userDao.findAll();
    }

}

package com.example.thymeleaf.controllers;


import com.example.thymeleaf.dao.UserDao;
import com.example.thymeleaf.models.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@AllArgsConstructor
public class UserController {

//    private final UserDao userDao;
//
//    @GetMapping("/hello")
//    public String hello() {
//        return "hello";
//    }
//
//    @GetMapping("/model")
//    public String get(Model model) {
//        model.addAttribute("x", "Model attribute");
//        return "hello.html";
//    }
//
//    @GetMapping("/save")
//    public String users (@RequestParam Map<Integer,String> map){
//        System.out.println(map);
//        return "index.html";
//    }
//
//
//    @PostMapping("/save")
//    public String saveUsers(@RequestParam String username, Model model) {
//        System.out.println(username);
//        userDao.save(new User(username));
//        model.addAttribute("users", userDao.findAll());
//        return "users.html";
//    }
//
//    @GetMapping("/users/{id}")
//    public String getUser(@PathVariable int id, Model model) {
//        User one = userDao.getOne(id);
//        model.addAttribute("user", one);
//        return "user.html";
//    }

}

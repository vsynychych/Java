package com.example.services.Services;

import com.example.services.Models.User;

import java.util.List;

public interface UserService {

     User save(User user);

     List<User> findAll();

     User getById(int id);

     void deleteById(int id);

     User updateById(int id, String name, int age);

}

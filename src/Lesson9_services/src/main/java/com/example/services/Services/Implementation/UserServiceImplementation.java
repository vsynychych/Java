package com.example.services.Services.Implementation;

import com.example.services.Dao.UserDAO;
import com.example.services.Models.User;
import com.example.services.Services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImplementation implements UserService {

    private final UserDAO userDAO;

    @Override
    public User save(User user) {
        return userDAO.save(user);
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public User getById(int id) {
        Optional<User> byId = userDAO.findById(id);
        return byId.orElse(null);
    }

    @Override
    public void deleteById(int id) {
        userDAO.deleteById(id);
    }

    @Override
    public User updateById(int id, String name, int age) {
        User one = userDAO.getOne(id);
        one.setName(name);
        one.setAge(age);
        return userDAO.save(one);
    }
}

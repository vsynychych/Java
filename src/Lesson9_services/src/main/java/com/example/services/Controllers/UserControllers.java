package com.example.services.Controllers;
//#Практическая
//        - создать сущность User c полями имя и возраст
//        - создать сервис для записи user в БД, чтения всех,
//          чтения по id, удаления по id, и обновления по id

import com.example.services.Models.User;
import com.example.services.Services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserControllers {

    private final UserService userService;

    @PostMapping("/save")
    public User saveUser (@RequestParam String   name,
                          @RequestParam int age){
        return  userService.save(new User(name, age));
    }

    @PostMapping("/find")
    public List<User> findAll(){
      return userService.findAll();
    }

    @PostMapping("/{id}")
    public User getById(@PathVariable int id){
       return userService.getById(id);
    }

    @PostMapping("/{id}/delete")
    public void deleteById(@PathVariable int id){
        userService.deleteById(id);
    }

    @PostMapping("/{id}/update")
    public User updateUser (@PathVariable int id,
                            @RequestParam String name,
                            @RequestParam int age){
        return userService.updateById(id,name, age);
    }


}

package com.example.relation2.Controllers;

import com.example.relation2.Dao.UserDao;
import com.example.relation2.Models.Car;
import com.example.relation2.Models.Skills;
import com.example.relation2.Models.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserDao userDao;

    @GetMapping()
    private  List<User> userList(){
       return userDao.findAll();
    }

    @GetMapping("/save")
    private void save(){
        User nastia = new User();
        nastia.setName("Anastasia");
        nastia.setAge(28);
        List<Skills> skillsList1 = new ArrayList<>();
        skillsList1.add(new Skills("Java"));
        skillsList1.add(new Skills("Angular"));
        skillsList1.add(new Skills("Spring"));
        nastia.setSkills(skillsList1);

        User oleg = new User();
        oleg.setName("Oleg");
        oleg.setAge(20);
        List<Skills> skillsList2 = new ArrayList<>();
        skillsList2.add(new Skills("JS"));
        skillsList2.add(new Skills("React"));
        oleg.setSkills(skillsList2);

        userDao.save(nastia);
        userDao.save(oleg);
    }

    @GetMapping("saveCar")
    private void saveCar(){
        User maks = new User();
        maks.setName("Maks");
        maks.setAge(33);
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMW",2020));
        carList.add(new Car("Opel",2012));
        maks.setCars(carList);
        userDao.save(maks);
    }

}

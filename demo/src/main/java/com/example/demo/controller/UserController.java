package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> getAllUsers(){
        List<User> userList=new ArrayList<>();


        userList.add(new User(1,"maha","21"));
        userList.add(new User(2,"maha","21"));
        userList.add(new User(3,"maha","21"));
        userList.add(new User(4,"maha","21"));
        userList.add(new User(5,"maha","21"));
        userList.add(new User(6,"maha","21"));


        return userList;
    }
    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        User user=new User(id,"zargham","21");
        return user;
    }

}

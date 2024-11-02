package com.example.spring_mongo_project.controller;

import com.example.spring_mongo_project.collection.User;
import com.example.spring_mongo_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public String save (@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping
    public List<User> getUserStartsWith(@RequestParam("name") String name) {
        return userService.getUserStartsWith(name);
    }
}

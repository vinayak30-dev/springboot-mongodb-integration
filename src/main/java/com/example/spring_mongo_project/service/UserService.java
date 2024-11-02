package com.example.spring_mongo_project.service;

import com.example.spring_mongo_project.collection.User;

import java.util.List;

public interface UserService  {
    String save(User user);

    List<User> getUserStartsWith(String name);
}

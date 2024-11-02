package com.example.spring_mongo_project.service;

import com.example.spring_mongo_project.collection.User;
import com.example.spring_mongo_project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String save(User user) {
        return userRepository.save(user).getUserName();
    }

    @Override
    public List<User> getUserStartsWith(String name) {
        return userRepository.findByFirstName(name);
    }
}

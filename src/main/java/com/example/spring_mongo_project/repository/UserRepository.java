package com.example.spring_mongo_project.repository;

import com.example.spring_mongo_project.collection.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByFirstName(String name);
}

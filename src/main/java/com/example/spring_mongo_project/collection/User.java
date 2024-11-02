package com.example.spring_mongo_project.collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Builder
@Data
@Document("user")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    @Id
    private String userName;
    private String firstName;
    private String lastName;
    private String middleName;
    private int accountAgeInDays;
    private float rating;
    private List<String> contests;
    private List<String> friends;
}

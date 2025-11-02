package com.example.users.controller;

import com.example.users.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {
    // Dummy user data
    private List<User> users = Arrays.asList(
            new User("Amal", 25, "NewYork"),
            new User("Buvan", 30, "London"),
            new User("Charan", 25, "NewYork"),
            new User("Deepak", 28, "Paris"),
            new User("Eshwar", 25, "India")
    );

    @GetMapping("/users/filter")
    public List<User> filterUsers(
            @RequestParam(required = false) Integer age,
            @RequestParam(required = false) String city) {

        // Stream filter logic
        return users.stream()
                .filter(user -> (age == null || user.getAge() == age))
                .filter(user -> (city == null || user.getCity().equalsIgnoreCase(city)))
                .collect(Collectors.toList());
    }
}

package com.gruppuppgift3.controllers;


import com.gruppuppgift3.domain.User;
import com.gruppuppgift3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
public class UserController {


    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("all")
    public List<User> getAllUsers() {
        return userService.fetchAllUsers();
    }


    // This is a comment

}

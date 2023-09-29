package com.gruppuppgift3.service.impl;

import com.gruppuppgift3.repositories.UserRepository;
import com.gruppuppgift3.service.UserService;
import com.gruppuppgift3.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> fetchAllUsers() {
        return userRepository.getUsers();
    }
}

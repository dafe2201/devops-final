package com.gruppuppgift3.impl;

import com.gruppuppgift3.repositories.UserRepository;
import com.gruppuppgift3.service.UserService;
import com.gruppuppgift3.domain.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public List<User> fetchAllUsers() {
        return UserRepository.getUsers();
    }
}

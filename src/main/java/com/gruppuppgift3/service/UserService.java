package com.gruppuppgift3.service;

import com.gruppuppgift3.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> fetchAllUsers();
}

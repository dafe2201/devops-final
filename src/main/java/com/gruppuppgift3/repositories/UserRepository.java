package com.gruppuppgift3.repositories;

import com.gruppuppgift3.domain.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {

    private static final List<User> users = new ArrayList<>();

    static {

        users.add(new User("Andreas", "999999-9999"));
        users.add(new User("Alex", "888888-8888"));
        users.add(new User("Oscar", "777777-7777"));
        users.add(new User("Daniel", "666666-6666"));

    }

    public static List<User> getUsers() {
        return users;
    }


}

package com.gruppuppgift3.repositories;

import com.gruppuppgift3.domain.User;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    private static List<User> users = new ArrayList<>();

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

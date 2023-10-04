package com.gruppuppgift3.service.impl;

import com.gruppuppgift3.domain.User;
import com.gruppuppgift3.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceImplTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl userServiceImpl;

    @Test
    public void fetchAllUsersTest(){
        //Given
        List<User> users = new ArrayList<>();
        users.add(new User("Andreas", "999999-9999"));
        users.add(new User("Alex", "888888-8888"));
        users.add(new User("Oscar", "777777-7777"));
        users.add(new User("Daniel", "666666-6666"));
        //When
        when(userRepository.getUsers()).thenReturn(users);

        List<User> result = userServiceImpl.fetchAllUsers();

        //Then
        assertThat(result).isEqualTo(users);
    }

    @Test
    public void fetchAllUsersTestFailing(){
        //Given
        List<User> users = new ArrayList<>();
        users.add(new User("Andreas", "999999-9999"));
        users.add(new User("Alex", "888888-8888"));
        users.add(new User("Oscar", "777777-7777"));
        users.add(new User("Daniel", "666666-6666"));
        //When
        when(userRepository.getUsers()).thenReturn(users);

        List<User> result = userServiceImpl.fetchAllUsers();

        //Then
        assertThat(result).isNotEqualTo(users);
    }

}

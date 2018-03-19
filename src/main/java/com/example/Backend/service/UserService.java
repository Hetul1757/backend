package com.example.Backend.service;

import com.example.Backend.model.User;
import com.example.Backend.model.UserDto;

import java.util.List;

public interface UserService {

	User save(UserDto user);
    List<User> findAll();
    void delete(long id);
    User findOne(String username);
    User findById(Long id);
}

package com.example.springbootcrud.service;

import com.example.springbootcrud.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    //comment
    User add(User user);

}

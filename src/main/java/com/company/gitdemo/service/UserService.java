package com.company.gitdemo.service;

import java.util.List;

import com.company.gitdemo.dto.User;

public interface UserService {

    List<User> getUsers();

    User getUser(String id);

    void setUser(User user);
}

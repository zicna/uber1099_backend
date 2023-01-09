package com.uber1099.uber1099.service;

import java.util.List;

import com.uber1099.uber1099.pojo.User;

public interface UserService {
    // get user, users, save user, delete user, update user
    public User getUserById(String id);
    public List<User> getUsers();
    public void addUser(User user);
    public void deleteUser(int index);
    public void updateUser(int index, User user);
}



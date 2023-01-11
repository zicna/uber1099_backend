package com.uber1099.uber1099.service;

import java.util.List;

import com.uber1099.uber1099.exception.NoUserException;
import com.uber1099.uber1099.pojo.User;

public interface UserService {
    // get user, users, save user, delete user, update user
    public User getUserById(String id) throws NoUserException;
    public List<User> getUsers();
    public void saveUser(User user);
    public void updateUser(String id, User user) throws NoUserException;
    public void deleteUser(String id) throws NoUserException;
}



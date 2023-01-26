package com.uber1099.uber1099.service.user;

import java.util.List;

import com.uber1099.uber1099.pojo.User;

public interface UserService {
    public User getUserById(String id);
    public List<User> getUsers();
    public void saveUser(User user);
    public void updateUser(String id, User user);
    public void deleteUser(String id);
}



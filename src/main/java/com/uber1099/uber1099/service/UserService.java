package com.uber1099.uber1099.service;

import java.util.ArrayList;

import com.uber1099.uber1099.pojo.User;
import com.uber1099.uber1099.repository.UserRepository;

public class UserService implements UserServiceImplementation {

    UserRepository userRepo = new UserRepository();

    @Override
    public User getUser(int index) {
        return userRepo.getUser(index);
    }

    @Override
    public ArrayList<User> getUsers() {
        return userRepo.getUsers();
    }

    @Override
    public void addUser(User user) {
        userRepo.addUser(user);
    }

    @Override
    public void deleteUser(int index) {
        userRepo.deleteUser(index);
    }

    @Override
    public void updateUser(int index, User user) {
        userRepo.updateUser(index, user);
    }
    
}

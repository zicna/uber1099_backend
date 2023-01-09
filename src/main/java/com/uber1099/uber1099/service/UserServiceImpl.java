package com.uber1099.uber1099.service;

import java.util.List;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uber1099.uber1099.pojo.User;
import com.uber1099.uber1099.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepo;

    @Override
    public User getUserById(String id) {
        return userRepo.getUser(findIndexById(id));
    }

    @Override
    public List<User> getUsers() {
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

    private int findIndexById(String id){
        int ind = IntStream.range(0, userRepo.getUsers().size())
            .filter(index -> userRepo.getUsers().get(index).getId().equals(id))
            .findFirst()
            .orElseThrow();

            System.out.println(ind);
            return ind;
    }
}

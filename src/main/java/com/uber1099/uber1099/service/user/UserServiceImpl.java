package com.uber1099.uber1099.service.user;

import java.util.List;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uber1099.uber1099.exception.NoUserException;
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
    public void saveUser(User user) {
        userRepo.addUser(user);
    }

    @Override
    public void updateUser(String id, User user){
        userRepo.updateUser(findIndexById(id), user);
    }

    @Override
    public void deleteUser(String id){
        userRepo.deleteUser(findIndexById(id));
    }


    private int findIndexById(String id){
        return IntStream.range(0, userRepo.getUsers().size())
            .filter(index -> userRepo.getUsers().get(index).getId().equals(id))
            .findFirst()
            .orElseThrow(()->  new NoUserException(id));
    }
}

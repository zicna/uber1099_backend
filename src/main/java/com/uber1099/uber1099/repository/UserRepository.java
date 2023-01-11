package com.uber1099.uber1099.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uber1099.uber1099.exception.NoUserException;
import com.uber1099.uber1099.pojo.User;
@Repository
public class UserRepository {
    //* use private field for users until we connect our application to database */ 
    // get users, user, delete, update, add 
    private ArrayList<User> users = new ArrayList<>();
    // private List<User> users = Arrays.asList(
    //     new User("1","john@example.com", "1234", new Date(), "john"),
    //     new User("2", "Jack@example.com", "1234", new Date(), "jack")  
    // );

    public List<User> getUsers(){
        return users;
    }

    public User getUser(int index) throws NoUserException{
        return users.get(index);
    }
    
    public void addUser(User user){
            // here we should create copy of a user passed in
            // since we will migrate to use database this is not necessary
        users.add(user);
    }

    public void updateUser(int index, User user) throws NoUserException{
        users.set(index, user);
    }

    public void deleteUser(int index) throws NoUserException{
        users.remove(index);
    }
}

package com.uber1099.uber1099.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.uber1099.uber1099.pojo.User;
@Repository
public class UserRepository {
    //* use private field for users until we connect our application to database */ 
    // get users, user, delete, update, add 
    private ArrayList<User> users;

    public ArrayList<User> getUsers(){
        return users;
    }

    public User getUser(int index){
        return users.get(index);
    }
    
    public void addUser(User user){
            // here we should create copy of a user passed in
            // since we will migrate to use database this is not necessary
        users.add(user);
    }

    public void updateUser(int index, User user){
        users.set(index, user);
    }

    public void deleteUser(int index){
        users.remove(index);
    }





    
}

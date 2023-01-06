package com.uber1099.uber1099.repository;

import java.util.ArrayList;

import com.uber1099.uber1099.pojo.User;

public class UserRepository {
    //* use private field until we connect our application to database */ 
    // get users, user, delete, update, add 
    private ArrayList<User> users;

    public ArrayList<User> getUsers(){
        return users;
    }

    public User getUser(int index){
        return users.get(index);
    }

    public void addUser(User user){
        users.add(user);
    }

    public void updateUser(int index, User user){
        users.set(index, user);
    }

    public void deleteUser(int index){
        users.remove(index);
    }





    
}

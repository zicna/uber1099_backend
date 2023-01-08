package com.uber1099.uber1099.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uber1099.uber1099.pojo.User;
import com.uber1099.uber1099.service.UserService;


@Controller
public class UserController {

    @Autowired
    UserService userService;

    
    // @GetMapping(value="user")
    // public User getUser(@RequestParam User user) {
    //     return new User();
    // }
    
}

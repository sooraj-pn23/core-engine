package com.techton.rest.controller;

import com.techton.port.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/test")
    public String test(){
        return "hello world";
    }

    @GetMapping("/user/{userId}")
    public String getUser(@PathVariable String userId){
        return userService.getUser(userId).toString();
    }
}

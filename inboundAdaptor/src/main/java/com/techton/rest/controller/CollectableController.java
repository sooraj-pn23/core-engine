package com.techton.rest.controller;

import com.techton.port.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollectableController {
    @Autowired
    UserService userService;

    @GetMapping("/collection/{collectionId}")
    public String getUser(@PathVariable String collectionId){
        return userService.getUser(collectionId).toString();
    }
}

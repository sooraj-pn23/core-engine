package com.techton.rest.controller.service;

import com.techton.dto.UserDto;
import com.techton.handler.UserServiceHandler;
import com.techton.port.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserServiceHandler userServiceHandler;
    @Override
    public UserDto getUser(String userId) {
        return userServiceHandler.getUser(userId);
    }
}

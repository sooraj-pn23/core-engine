package com.techton.handler;


import com.techton.dto.UserDto;
import com.techton.port.UserDataAdaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceHandler {
    @Autowired
    UserDataAdaptor userDataAdaptor;
    public UserDto getUser(String userId) {
       return  userDataAdaptor.getUser(userId);
    }
}

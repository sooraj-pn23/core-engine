package com.techton.port;


import com.techton.dto.UserDto;

public interface UserService {
    UserDto getUser(String userId);
}

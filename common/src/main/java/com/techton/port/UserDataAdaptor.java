package com.techton.port;

import com.techton.dto.UserDto;

public interface UserDataAdaptor {
    UserDto getUser(String userId);
}

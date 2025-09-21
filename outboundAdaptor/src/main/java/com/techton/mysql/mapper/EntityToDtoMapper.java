package com.techton.mysql.mapper;

import com.techton.dto.UserDto;
import com.techton.mysql.entity.UserEntity;

public  class EntityToDtoMapper {
    public static UserDto UserEntityToDto(UserEntity userEntity){
       return UserDto.builder().id(userEntity.getId()).name(userEntity.getName()).build();
    }

}

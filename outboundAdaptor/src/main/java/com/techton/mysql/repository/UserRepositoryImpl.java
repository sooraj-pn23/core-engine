package com.techton.mysql.repository;

import com.techton.dto.UserDto;
import com.techton.mysql.entity.UserEntity;
import com.techton.mysql.mapper.EntityToDtoMapper;
import com.techton.port.UserDataAdaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRepositoryImpl implements UserDataAdaptor {

    @Autowired
    UserJpaRepository userJpaRepository;


    @Override
    public UserDto getUser(String userId) {
        UserEntity result=userJpaRepository.findById(userId).get();
         if(result==null){
             return null;
         }else
             return EntityToDtoMapper.UserEntityToDto(result);
    }
}

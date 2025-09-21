package com.techton.mysql.repository;

import com.techton.mysql.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserJpaRepository extends CrudRepository<UserEntity, String> {
    Optional<UserEntity> findById(String id);
}

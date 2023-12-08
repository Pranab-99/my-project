package com.example.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Serializable> {

}

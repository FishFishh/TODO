package com.todo.demo.service;

import com.todo.demo.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    User login(@Param("name") String name, @Param("password") String password);
    List<User> findAll();
    User findById();
    User insert(String name,String password);
    Integer deleteById(int id);
    Integer findId(int id);
}
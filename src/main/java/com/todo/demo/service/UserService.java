package com.todo.demo.service;

import com.todo.demo.entity.User;

import java.util.List;

public interface UserService {
    User login(String name,String password);
    List<User> findAll();
    User findById();
    User insert(String name,String password);
    Integer deleteById(int id);
    Integer findId(int id);
}

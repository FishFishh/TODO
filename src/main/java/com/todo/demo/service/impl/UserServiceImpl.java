package com.todo.demo.service.impl;

import com.todo.demo.entity.User;
import com.todo.demo.mapper.UserMapper;
import com.todo.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findById() {
        return null;
    }

    @Override
    public User insert(String name, String password) {
        return null;
    }

    @Override
    public Integer deleteById() {
        return null;
    }

    @Override
    public Integer deleteById(int id) {
        return null;
    }

    @Override
    public Integer findId(int id) {
        return null;
    }
}

package com.todo.demo.mapper;

import com.todo.demo.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Mapper//mapper类 DAO层
@Repository
public interface UserMapper {
    User login(@Param("name") String name,@Param("name") String password);
    List<User> findAll();
    User findById();
    User insert(String name,String password);
    Integer deleteById(int id);
    Integer findId(int id);
}
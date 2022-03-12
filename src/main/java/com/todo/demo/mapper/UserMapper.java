package com.todo.demo.mapper;

import com.todo.demo.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Mapper//mapper类 DAO层
@Repository
public interface UserMapper {
    User loginn(@Param("name") String name,@Param("password") String password);
    List<User> findAll();
    User findById();
    User insert(String name,String password);
    Integer deleteById(int id);
    Integer findId(int id);
}
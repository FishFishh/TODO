package com.todo.demo.entity;

import lombok.Data;

@Data//自动生成getter和setter
public class User {
    private Integer userId;
    private String userName;
    private String userPassword;
}

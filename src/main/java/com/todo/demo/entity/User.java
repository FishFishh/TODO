package com.todo.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//自动生成getter和setter
@NoArgsConstructor//无参构造
@AllArgsConstructor//有参构造
public class User {
    private Integer Id;
    private String Name;
    private String Password;
}

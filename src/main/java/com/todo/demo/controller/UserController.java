package com.todo.demo.controller;

import com.todo.demo.entity.User;
import com.todo.demo.mapper.UserMapper;
import com.todo.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

//提供user表数据的一些交互的方法
@RestController//@RestController 是@ResponseBody和@Controller的结合表明当前类是控制器且返回的是一组数据，不是页面

public class UserController {

    @Autowired//这个注解的作用是将其他的类，接口引入，类似于之前的类的初始化等，用这个注解，类中或接口的方法就可以直接调用了
    private UserService userService;

    @RequestMapping(path="/login",method=RequestMethod.GET)//当前台界面调用Controller处理数据时候告诉控制器怎么操作.作用：URL映射。
    public String login(@RequestParam(value = "name") String name, @RequestParam(value = "password")String password){
        User user = userService.login(name,password);
        if(user == null){
            return "error";
        }
        return "success";
    }
    @GetMapping("/findAll")//@RequestMapping(method = RequestMethod.GET)的简写.作用：对应查询，表明是一个查询URL映射
    public List<User> findAll() {
        return userService.findAll();
    }
    @PostMapping("/findById")//@RequestMapping(method = RequestMethod.POST)的简写.作用：对应增加，表明是一个增加URL映射
    public User findById(){
        return userService.findById();
    }
    @PutMapping("/insert")//@RequestMapping(method = RequestMethod.PUT)的简写作用：对应更新，表明是一个更新URL映射
    public User insert(String name,String password){
        return userService.insert(name,password);
    }
    @DeleteMapping("/deleteById")//@RequestMapping(method = RequestMethod.DELETE)的简写.作用：对应删除，表明是一个删除URL映射
    public Integer deleteById(int id){
        return userService.deleteById(id);
    }
}
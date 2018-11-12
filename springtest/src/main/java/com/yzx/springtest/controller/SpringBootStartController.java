package com.yzx.springtest.controller;

import com.yzx.springtest.model.User;
import com.yzx.springtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@EnableAutoConfiguration
public class SpringBootStartController {

    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    public Object helloWorld(){
        Map<String,Object> map = new HashMap<String,Object>(16);
        map.put("id",1);
        map.put("name","叶兆祥");
        map.put("age",27);
        User user = new User();
        user.setUserId(1);
        user.setPassword("222");
        user.setPhone("15370320076");
        user.setUserName("叶兆祥");
        userService.addUser(user);
        return map;
    }
}

package com.dome.sharding.controller;

import com.dome.sharding.entity.User;
import com.dome.sharding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author hong-2000
 * @version 1.0.0
 * @description
 * @create 2020/12/16 17:28
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/select")
    public List<User> select() {
        return userService.getUserList();
    }

    @GetMapping("/insert")
    public Boolean insert() {
        int start = 100;
        int end = 150;
        boolean result = false;
        for (int i = start; i < end; i++) {
            User user = User.builder().id(i).name("test").age((int) (1 + Math.random() * (10))).build();
            result = userService.save(user);
            if (!result) {
                break;
            }
        }
        return result;
    }

}

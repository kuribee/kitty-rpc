package com.kitty.rpc.consumer.controller;

import com.kitty.rpc.api.pojo.User;
import com.kitty.rpc.api.service.UserService;
import com.kitty.rpc.client.annotation.RpcReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @version 1.0
 * @ClassName UserController
 */
@RestController
public class UserController {

    @RpcReference
    private UserService userService;


    @RequestMapping("/user/getUser")
    public User getUser() {

        return userService.queryUser();
    }

    @RequestMapping("/user/getAllUser")
    public List<User> getAllUser() {

        return userService.getAllUsers();
    }

}

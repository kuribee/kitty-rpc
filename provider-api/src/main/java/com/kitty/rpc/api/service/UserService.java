package com.kitty.rpc.api.service;

import com.kitty.rpc.api.pojo.User;

import java.util.List;

/**
 * @version 1.0
 * @ClassName UserService
 */
public interface UserService {

    User queryUser();

    List<User> getAllUsers();

}

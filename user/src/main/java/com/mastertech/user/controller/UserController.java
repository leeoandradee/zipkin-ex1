package com.mastertech.user.controller;

import com.mastertech.user.cep.Cep;
import com.mastertech.user.cep.UserCep;
import com.mastertech.user.model.User;
import com.mastertech.user.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserCep userCep;

    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        Cep cep = userCep.getCep(user.getCep());
        user.setLogradouro(cep.getLogradouro());

        return userService.createUser(user);        
    }
    
}
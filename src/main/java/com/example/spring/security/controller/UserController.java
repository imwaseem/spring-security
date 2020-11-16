package com.example.spring.security.controller;

import com.example.spring.security.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    private static final List<User> USERS = Arrays.asList(
            new User(18880,"Waseem Nasir"),
            new User(1302,"Abacus conulting"),
            new User(1300,"John wick")
    );
    @GetMapping(path = "{userId}")
    public User getUser(@PathVariable("userId") Integer userId){

        return USERS.stream()
                .filter(user -> user.getUserId().equals(userId))
                .findFirst()
                .orElseThrow( ()-> new IllegalStateException("userId :" + userId + " does not exist"));
    }
}

package com.example.github.copilot.controller;

import com.example.github.copilot.Model.User;
import com.example.github.copilot.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public List<User> index() {
        return userService.getAllUser();
    }

    // get user by id
    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    // get user by username
    @GetMapping("/username/{username}")
    public User getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }

    // get user by email
    @GetMapping("/email/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return userService.getUserByEmail(email);
    }

    // get user by username or email
    @GetMapping("/username/{username}/email/{email}")
    public User getUserByUsernameOrEmail(@PathVariable String username, @PathVariable String email) {
        return userService.getUserByUsernameOrEmail(username, email);
    }
}


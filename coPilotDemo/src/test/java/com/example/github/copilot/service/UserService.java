package com.example.github.copilot.service;

import com.example.github.copilot.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> users = new ArrayList<>();

    public UserService() {
        users.add(new User(1, "Burak", "nburakacar@gmail.com"));
    }

    //get all user
    public List<User> getAllUser() {
        return users;
    }

    //  get user by id
    public User getUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    // add user
    public void addUser(User user) {
        users.add(user);
    }

    // update user
    public void updateUser(User user) {
        User userToUpdate = getUserById(user.getId());
        if (userToUpdate != null) {
            userToUpdate.setName(user.getName());
            userToUpdate.setEmail(user.getEmail());
        }
    }

    // delete user
    public void deleteUser(int id) {
        User userToDelete = getUserById(id);
        if (userToDelete != null) {
            users.remove(userToDelete);
        }
    }

    //getUserByUsername
    public User getUserByUsername(String username) {
        for (User user : users) {
            if (user.getName().equals(username)) {
                return user;
            }
        }
        return null;
    }

    //getUserByEmail
    public User getUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    //getUserByUsernameOrEmail
    public User getUserByUsernameOrEmail(String username, String email) {
        for (User user : users) {
            if (user.getName().equals(username) || user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

}

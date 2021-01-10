package com.thiethaa.springbootprofile.controller;

import com.thiethaa.springbootprofile.entity.User;
import com.thiethaa.springbootprofile.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/userlist")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") int id) {
        return userService.getUserbyId(id);
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PutMapping("edit/{id}")
    public User editUser(@RequestBody User user, @PathVariable("id") int id) {
        return userService.editUser(user, id);
    }

    @DeleteMapping("delete/{id}")
    public void deleteUser(@PathVariable("id") int id) {
        userService.deleteUser(id);
    }
}

package com.thiethaa.springbootprofile.service;


import com.thiethaa.springbootprofile.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    User getUserbyId(int id);

    User addUser(User user);

    User editUser(User user, int id);

    void deleteUser(int id);
}

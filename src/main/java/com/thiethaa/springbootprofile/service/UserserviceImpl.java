package com.thiethaa.springbootprofile.service;

import com.thiethaa.springbootprofile.entity.User;
import com.thiethaa.springbootprofile.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Profile(value = { "local", "dev" })
public class UserserviceImpl implements UserService{
    @Autowired
    private UserRepo userRepo;

    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getUserbyId(int id) {
        Optional<User> exisUser = userRepo.findById(id);
        User user = null;
        if(exisUser.isPresent()){
            user = exisUser.get();
        }
        return user;
    }

    @Override
    public User addUser(User newUser) {
        User user = new User();
        user.setUsername(newUser.getUsername());
        user.setPassword(newUser.getPassword());
        userRepo.save(user);
        return user;
    }

    @Override
    public User editUser(User newUser, int id) {
        Optional<User> exisUser = userRepo.findById(id);
        User user = null;
        if(exisUser.isPresent()){
            user = exisUser.get();
            user.setUsername(newUser.getUsername());
            user.setPassword(newUser.getPassword());
            userRepo.save(user);
        }
        return user;
    }

    @Override
    public void deleteUser(int id) {
        userRepo.deleteById(id);
    }
}

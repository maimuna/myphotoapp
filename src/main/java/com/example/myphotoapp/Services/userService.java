package com.example.myphotoapp.Services;

import com.example.myphotoapp.Repository.userRepository;
import com.example.myphotoapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {

    @Autowired
    private userRepository repo;
    public User getUser()
    {
        return repo.getUser();
    }

    public User saveUser(User user) {
        return repo.saveUser(user);
    }

    public User updateUser(User user) {
        return repo.updateUser(user);
    }

    public List<User> getAllUser() {
        return repo.getAllUser();
    }

    public User getUserByID(int userID) {
        return repo.getUserById(userID);
    }

    public User updateUserByID(int userID, User user) {
        return repo.updateUserById(userID,user);
    }

    public User deleteUserByID(int userID) {
        return repo.deleteUserById(userID) ;
    }
}

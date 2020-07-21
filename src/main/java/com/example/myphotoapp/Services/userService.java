package com.example.myphotoapp.Services;

import com.example.myphotoapp.Repository.userRepository;
import com.example.myphotoapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {

    @Autowired
    private userRepository repo;
    public User getUser()
    {
        return repo.getUser();
    }
}

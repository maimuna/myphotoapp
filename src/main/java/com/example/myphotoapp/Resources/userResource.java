package com.example.myphotoapp.Resources;


import com.example.myphotoapp.model.User;
import com.example.myphotoapp.Services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class userResource {

    @Autowired
    private userService se;

    @GetMapping("/user")
    public User getUser()
    {
        return se.getUser();
    }
}

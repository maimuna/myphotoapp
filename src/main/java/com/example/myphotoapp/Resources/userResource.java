package com.example.myphotoapp.Resources;

import com.example.myphotoapp.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class userResource {

    @GetMapping("/user")
    public User getUser()
    {
        User user = new User("kali","usa",12);
        return user;
    }
}

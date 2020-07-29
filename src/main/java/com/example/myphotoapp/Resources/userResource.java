package com.example.myphotoapp.Resources;


import com.example.myphotoapp.model.User;
import com.example.myphotoapp.Services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PostMapping("/user")
    public User saveUser(@RequestBody User user)
    {
        return se.saveUser(user);
    }

    @GetMapping("/allUsers")
    public List<User> getAllUser()
    {
        return se.getAllUser();
    }

    @GetMapping("/user/{userID}")
    public User getUserById(@PathVariable("userID") int userID)
    {
        return se.getUserByID(userID);
    }


    @PutMapping("/user/{userId}")
    public User updateUserById(@PathVariable("userId") int userID, @RequestBody User user)
    {
        return se.updateUserByID(userID,user);
    }

    @DeleteMapping("/user")
    public User deleteUserById(@RequestParam(name="userID") int userID)
    {
        return se.deleteUserByID(userID);
    }
}

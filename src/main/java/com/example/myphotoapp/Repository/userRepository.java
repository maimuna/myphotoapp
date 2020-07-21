package com.example.myphotoapp.Repository;

import com.example.myphotoapp.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class userRepository {

    public User getUser()
    {
        User user = new User("maimuna","usa",12);
        return user;
    }
}

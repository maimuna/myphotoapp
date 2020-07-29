package com.example.myphotoapp.Repository;

import com.example.myphotoapp.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class userRepository {

    List<User> userList = new ArrayList();
    public User getUser()
    {
        User user = new User("maimuna","usa",12);
        return user;
    }

    public User saveUser(User u) {
        u.setUserID(userList.size()+1);
        userList.add(u);
        return u;
    }

    public User updateUser(User user) {
        return null;
    }

    public List<User> getAllUser() {
        return userList;
    }

    public User getUserById(int userID) {
        for (User user : userList)
        {
          if (user.getUserID()== userID) {
              return user;
          }
        }
        return null;

    }

    public User updateUserById(int userID, User user) {
        for (User u : userList)
        {
            if (u.getUserID()== userID) {
                u.setName(user.getName());
                u.setAddress(user.getAddress());
                u.setAge(user.getAge());
                return  u;
            }
        }
        return null;
    }

    public User deleteUserById(int userID) {
        User deletedUser = null;
        for (User u : userList)
        {
            if (u.getUserID()== userID) {
                deletedUser=u;
                userList.remove(u);
                return deletedUser;
            }
        }
        return deletedUser;
    }
}

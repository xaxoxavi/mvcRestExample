package com.esliceu.dwes.service;

import com.esliceu.dwes.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xavi Torrens
 */
public class UserMockService implements UserService {
    @Override
    public List<User> findAllUsers() {
        List<User> userList = new ArrayList<>();

        User user = new User();
        user.setName("Xavi");
        userList.add(user);

        user = new User();
        user.setName("Niqui");
        userList.add(user);

        user = new User();
        user.setName("Toni");
        userList.add(user);

        user = new User();
        user.setName("Paqui");
        userList.add(user);

        return userList;
    }
}

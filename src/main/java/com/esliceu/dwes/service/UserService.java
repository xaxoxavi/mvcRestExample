package com.esliceu.dwes.service;

import com.esliceu.dwes.model.User;

import java.util.List;

/**
 * @author Xavi Torrens
 */
public interface UserService {

    List<User> findAllUsers();
}

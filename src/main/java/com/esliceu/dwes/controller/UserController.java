package com.esliceu.dwes.controller;

import com.esliceu.dwes.model.User;
import com.esliceu.dwes.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

/**
 * @author Xavi Torrens
 */
@RestController
public class UserController {
    //We only use Qualifier when there is a
    //conflict between two beans for the UserService
    @Inject
    @Qualifier("userService")
    private UserService service;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> findUsers(){

        return service.findAllUsers();
    }


}

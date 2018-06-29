package com.gamaza.examples.springmongodb.controller;

import com.gamaza.examples.springmongodb.model.User;
import com.gamaza.examples.springmongodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    /** Get all users **/

    @RequestMapping(method = RequestMethod.GET)
    public List<User> all(){
        return userService.findAll();
    }

    /** Insert new user **/

    @RequestMapping(method = RequestMethod.POST)
    public void insert(@RequestBody User user){
        userService.create(user);
    }

    /** Update existing user **/

    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody User user){
        userService.update(user);
    }

    /** Delete user **/

    @RequestMapping(method = RequestMethod.DELETE)
    public void delete(@RequestBody User user){
        userService.delete(user);
    }

}

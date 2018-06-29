package com.gamaza.examples.springmongodb.service;

import com.gamaza.examples.springmongodb.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    void create(User user);
    void update (User user);
    void delete(User user);

}

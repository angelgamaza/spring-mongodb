package com.gamaza.examples.springmongodb.service;

import com.gamaza.examples.springmongodb.dao.UserDAO;
import com.gamaza.examples.springmongodb.model.User;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    @Override
    public List<User> findAll() {
        return Lists.newArrayList(userDAO.findAll());
    }

    @Override
    public void create(User user) {
        userDAO.save(user);
    }

    @Override
    public void update(User user) {
        userDAO.save(user);
    }

    @Override
    public void delete(User user) {
        userDAO.delete(user);
    }
}

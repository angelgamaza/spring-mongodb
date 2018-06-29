package com.gamaza.examples.springmongodb.dao;

import com.gamaza.examples.springmongodb.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDAO extends CrudRepository<User, Integer> {}

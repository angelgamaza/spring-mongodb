package com.gamaza.examples.springmongodb.dao;

import com.gamaza.examples.springmongodb.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends CrudRepository<User, Integer> {}

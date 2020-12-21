package com.itechknowledge.server.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.itechknowledge.server.app.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {

    User findByUsername(String username);
}
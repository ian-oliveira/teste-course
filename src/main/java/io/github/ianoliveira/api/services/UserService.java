package io.github.ianoliveira.api.services;

import io.github.ianoliveira.api.domain.User;

import java.util.List;

public interface UserService  {

    User findById(Integer id);

    List<User> findAll();
}

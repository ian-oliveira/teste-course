package io.github.ianoliveira.api.services;

import io.github.ianoliveira.api.domain.User;

public interface UserService  {

    User findById(Integer id);

}

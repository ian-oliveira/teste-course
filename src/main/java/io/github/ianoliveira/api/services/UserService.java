package io.github.ianoliveira.api.services;

import io.github.ianoliveira.api.domain.User;
import io.github.ianoliveira.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService  {

    User findById(Integer id);

    List<User> findAll();

    User create(UserDTO obj);

    User update(UserDTO obj);

    void delete(Integer id);
}

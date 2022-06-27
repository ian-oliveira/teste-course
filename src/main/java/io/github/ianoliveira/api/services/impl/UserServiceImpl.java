package io.github.ianoliveira.api.services.impl;

import io.github.ianoliveira.api.domain.User;
import io.github.ianoliveira.api.repositories.UserRepository;
import io.github.ianoliveira.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService  {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElse(null);
    }
}
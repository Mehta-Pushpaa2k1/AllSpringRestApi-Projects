package com.jsp.user.service.impl;

import com.jsp.user.model.User;
import com.jsp.user.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findUserById(int id) {
        Optional<User> op = userRepository.findById(id);

        if (op.isPresent()) {
            return op.get();
        } else {
            throw new RuntimeException("User not found");
        }
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
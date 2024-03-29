package com.yma.ecomstore.service.impl;


import com.yma.ecomstore.domain.User;
import com.yma.ecomstore.repository.UserRepository;
import com.yma.ecomstore.service.UserService;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User users) {
        return userRepository.save(users);
    }

    @Override
    public User findUserById(Long id) {
        return null;
    }

    @Override
    public User updateUser(User users) {
        return null;
    }

    @Override
    public void deleteUser() {

    }
}

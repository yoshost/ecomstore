package com.yma.ecomstore.service;

import com.yma.ecomstore.domain.User;

public interface UserService {

    public User createUser(User users);

    public User findUserById(Long id);

    public User updateUser(User users);

    public void deleteUser();
}

package com.madhusha.spring_boot_device_seller.service;

import com.madhusha.spring_boot_device_seller.model.Role;
import com.madhusha.spring_boot_device_seller.model.User;
import jakarta.transaction.Transactional;

import java.util.Optional;

public interface UserService {

    User saveUser(User user);

    Optional<User> findByUsername(String username);

    @Transactional
    void changeUserRole(String username, Role role);
}

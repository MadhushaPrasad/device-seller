package com.madhusha.spring_boot_device_seller.service.impl;

import com.madhusha.spring_boot_device_seller.model.Role;
import com.madhusha.spring_boot_device_seller.model.User;
import com.madhusha.spring_boot_device_seller.repository.UserRepository;
import com.madhusha.spring_boot_device_seller.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.LocalTime;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        user.setCreateTime(LocalTime.from(LocalDateTime.now()));
        return userRepository.save(user);
    }
}

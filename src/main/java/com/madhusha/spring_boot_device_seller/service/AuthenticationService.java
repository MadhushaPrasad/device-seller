package com.madhusha.spring_boot_device_seller.service;

import com.madhusha.spring_boot_device_seller.model.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}

package com.madhusha.spring_boot_device_seller.service.impl;

import com.madhusha.spring_boot_device_seller.model.User;
import com.madhusha.spring_boot_device_seller.security.UserPrincipal;
import com.madhusha.spring_boot_device_seller.security.jwt.JwtProvider;
import com.madhusha.spring_boot_device_seller.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {


    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtProvider jwtProvider;

    @Override
    public User signInAndReturnJWT(User signInRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(signInRequest.getUsername(), signInRequest.getPassword())
        );

        UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();

        String jwt = jwtProvider.generateToken(userPrincipal);

        User signedInUser = userPrincipal.getUser();

        signedInUser.setToken(jwt);

        return signedInUser;
    }

}

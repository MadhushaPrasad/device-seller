package com.madhusha.spring_boot_device_seller.controller;

import com.madhusha.spring_boot_device_seller.model.Role;
import com.madhusha.spring_boot_device_seller.security.UserPrincipal;
import com.madhusha.spring_boot_device_seller.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PutMapping("change/{role}") // api/user/change/{role}
    public ResponseEntity<?> changeUserRole(@AuthenticationPrincipal UserPrincipal userPrincipal, @PathVariable Role role) {
        userService.changeUserRole(userPrincipal.getUsername(), role);
        return ResponseEntity.ok(true);
    }
}

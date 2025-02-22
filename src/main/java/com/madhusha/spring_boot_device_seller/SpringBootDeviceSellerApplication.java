package com.madhusha.spring_boot_device_seller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringBootDeviceSellerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDeviceSellerApplication.class, args);
	}
}

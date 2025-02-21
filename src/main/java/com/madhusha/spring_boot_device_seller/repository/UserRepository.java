package com.madhusha.spring_boot_device_seller.repository;

import com.madhusha.spring_boot_device_seller.model.Role;
import com.madhusha.spring_boot_device_seller.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // find user by username
    Optional<User> findByUsername(String username); // This method is used to find a user by username

    @Modifying // This annotation is used to specify the modification
    @Query("update User u set u.role = :role where u.username = :username") // This annotation is used to specify the query
    void updateUserRole(@Param("username") String username, @Param("role") Role role); // This method is used to update the user role

}

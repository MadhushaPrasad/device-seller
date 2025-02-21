package com.madhusha.spring_boot_device_seller.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalTime;

@Data // This annotation is used to generate getters and setters
@Entity // This annotation is used to specify the class is an entity
@Table(name = "users") // This annotation is used to specify the table name in the database
public class User {
    @Id // This annotation is used to specify the primary key of an entity
    @GeneratedValue(strategy = GenerationType.IDENTITY)// This annotation is used to specify the primary key generation strategy
    private Long id;

    @Column(name = "username", unique = true, nullable = false, length = 100) // This annotation is used to specify the column name in the database
    private String username;

    @Column(name = "password", nullable = false, length = 100) // This annotation is used to specify the column name in the database
    private String password;

    @Column(name = "name", nullable = false, length = 100) // This annotation is used to specify the column name in the database
    private String name;

    @Column(name = "create_time", nullable = false) // This annotation is used to specify the column name in the database
    private LocalTime createTime;

    //role
    @Enumerated(EnumType.STRING) // This annotation is used to specify the enumerated type
    @Column(name = "role", nullable = false) // This annotation is used to specify the column name in the database
    private Role role;
}

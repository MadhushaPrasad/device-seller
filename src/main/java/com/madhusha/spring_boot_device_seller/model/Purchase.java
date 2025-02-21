package com.madhusha.spring_boot_device_seller.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "purchases")
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @ManyToOne(fetch = FetchType.LAZY) // This annotation is used to specify the fetch type
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false) // This annotation is used to specify the column name in the database
    private User user;

    @Column(name = "device_id", nullable = false)
    private Long deviceId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "device_id", referencedColumnName = "id", insertable = false, updatable = false) // This annotation is used to specify the column name in the database
    private Device device;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "color", nullable = false)
    private String color;

    @Column(name = "purchase_time", nullable = false)
    private LocalDateTime purchaseTime;
}

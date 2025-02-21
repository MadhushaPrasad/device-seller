package com.madhusha.spring_boot_device_seller.repository;

import com.madhusha.spring_boot_device_seller.model.Purchase;
import com.madhusha.spring_boot_device_seller.repository.projection.PurchaseItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

    @Query("SELECT d.name as name, d.deviceType as type, p.price as price, p.color as color, " +
            "p.purchaseTime as purchaseTime FROM Purchase p LEFT JOIN Device d ON d.id = p.deviceId " +
            "WHERE p.userId = :userId")
    List<PurchaseItem> findAllPurchasesOfUser(@Param("userId") Long userId); //    find the puschase of the user
}

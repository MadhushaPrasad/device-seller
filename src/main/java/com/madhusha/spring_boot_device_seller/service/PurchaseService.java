package com.madhusha.spring_boot_device_seller.service;

import com.madhusha.spring_boot_device_seller.model.Purchase;
import com.madhusha.spring_boot_device_seller.repository.projection.PurchaseItem;

import java.util.List;

public interface PurchaseService {
    Purchase savePurchase(Purchase purchase);

    List<PurchaseItem> findAllPurchases(Long userId);
}

package com.madhusha.spring_boot_device_seller.service.impl;

import com.madhusha.spring_boot_device_seller.model.Purchase;
import com.madhusha.spring_boot_device_seller.repository.PurchaseRepository;
import com.madhusha.spring_boot_device_seller.repository.projection.PurchaseItem;
import com.madhusha.spring_boot_device_seller.service.PurchaseService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {
    private final PurchaseRepository purchaseRepository;

    public PurchaseServiceImpl(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    @Override
    public Purchase savePurchase(Purchase purchase) {
        purchase.setPurchaseTime(LocalDateTime.now());
        return purchaseRepository.save(purchase);
    }

    @Override
    public List<PurchaseItem> findAllPurchases(Long userId) {
        return purchaseRepository.findAllPurchasesOfUser(userId);
    }
}

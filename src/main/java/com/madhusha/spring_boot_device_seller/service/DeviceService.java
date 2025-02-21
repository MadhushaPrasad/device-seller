package com.madhusha.spring_boot_device_seller.service;

import com.madhusha.spring_boot_device_seller.model.Device;
import jakarta.transaction.Transactional;

import java.util.List;

public interface DeviceService {
    Device saveDevice(Device device);

    List<Device> findAllDevices();

    @Transactional
    void deleteDevice(Long id);
}

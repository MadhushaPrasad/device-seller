package com.madhusha.spring_boot_device_seller.service.impl;

import com.madhusha.spring_boot_device_seller.model.Device;
import com.madhusha.spring_boot_device_seller.repository.DeviceRepository;
import com.madhusha.spring_boot_device_seller.service.DeviceService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {

    private DeviceRepository deviceRepository;

    public DeviceServiceImpl(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    @Override
    public Device saveDevice(Device device) {
        device.setCreateTime(LocalDateTime.now());
        return deviceRepository.save(device);
    }

    @Override
    public List<Device> findAllDevices() {
        return deviceRepository.findAll();
    }

    @Transactional
    @Override
    public void deleteDevice(Long id) {
        Device device = deviceRepository.findById(id).orElse(null);
        if (device != null) {
            deviceRepository.delete(device);
        }
    }
}

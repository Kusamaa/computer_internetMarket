package com.kusamaa.computers.service;

import com.kusamaa.computers.entity.Device;
import com.kusamaa.computers.entity.Hardware;
import com.kusamaa.computers.repository.DeviceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DeviceService {

    private final DeviceRepository deviceRepository;

    public List<Device> findAll(){
        List<Device> devices = new ArrayList<>();

        Iterator<Device> deviceIterator = deviceRepository.findAll().iterator();
        while(deviceIterator.hasNext()){
            devices.add(deviceIterator.next());
        }

        return devices;
    }

    public List<Device> findAllByDeviceTypeId(Integer deviceTypeId){
        return deviceRepository.findAllByDeviceTypeId(deviceTypeId);
    }

    public List<Device> findAllByDeviceId(Integer deviceId){
        return deviceRepository.findAllByDeviceId(deviceId);
    }

    public Device findById(Integer deviceId){
        return deviceRepository.findById(deviceId).get();
    }
}

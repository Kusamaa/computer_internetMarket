package com.kusamaa.computers.service;

import com.kusamaa.computers.entity.DeviceType;
import com.kusamaa.computers.repository.DeviceTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DeviceTypeService {

    private final DeviceTypeRepository deviceTypeRepository;

    public List<DeviceType> findAll(){
        List<DeviceType> deviceTypes = new ArrayList<>();

        Iterator<DeviceType> deviceIterator = deviceTypeRepository.findAll().iterator();
        while(deviceIterator.hasNext()){
            deviceTypes.add(deviceIterator.next());
        }
        return deviceTypes;
    }
}

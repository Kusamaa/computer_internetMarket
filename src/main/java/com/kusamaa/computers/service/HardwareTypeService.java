package com.kusamaa.computers.service;

import com.kusamaa.computers.entity.HardwareType;
import com.kusamaa.computers.repository.HardwareTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class HardwareTypeService {

    private final HardwareTypeRepository hardwareTypeRepository;

    public List<HardwareType> findAll(){
        List<HardwareType> hardwareTypes = new ArrayList<>();

        Iterator<HardwareType> hardwareTypeIterator = hardwareTypeRepository.findAll().iterator();
        while(hardwareTypeIterator.hasNext()){
            hardwareTypes.add(hardwareTypeIterator.next());
        }
        return hardwareTypes;
    }
}

package com.kusamaa.computers.service;

import com.kusamaa.computers.entity.Hardware;
import com.kusamaa.computers.repository.HardwareRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class HardwareService {

    private final HardwareRepository hardwareRepository;

    public List<Hardware> findAll(){
        List<Hardware> hardwares = new ArrayList<>();

        Iterator<Hardware> hardwareIterator = hardwareRepository.findAll().iterator();
        while (hardwareIterator.hasNext()){
            hardwares.add(hardwareIterator.next());
        }

        return hardwares;
    }

    public List<Hardware> findAllByHardwareTypeId(Integer hardwareTypeId){
        return hardwareRepository.findAllByHardwareTypeId(hardwareTypeId);
    }

    public Hardware findById(Integer hardwareId){
        return hardwareRepository.findById(hardwareId).get();
    }
}


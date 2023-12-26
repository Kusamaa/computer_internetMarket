package com.kusamaa.computers.service;


import com.kusamaa.computers.entity.DeviceType;
import com.kusamaa.computers.entity.Hardware;
import com.kusamaa.computers.entity.HardwareType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class MenuService {

    private final DeviceTypeService deviceTypeService;
    private final HardwareTypeService hardwareTypeService;

    public Model getMenuModel(Model model){

        List<DeviceType> deviceTypes = deviceTypeService.findAll();
        List<HardwareType> hardwareTypes = hardwareTypeService.findAll();
        model.addAttribute("deviceTypes", deviceTypes);
        model.addAttribute("hardwareTypes", hardwareTypes);

        return model;
    }

}

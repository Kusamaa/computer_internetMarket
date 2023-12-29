package com.kusamaa.computers.controller;

import com.kusamaa.computers.entity.Hardware;
import com.kusamaa.computers.service.HardwareService;
import com.kusamaa.computers.service.MenuService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
public class HardwaresController {

    private final HardwareService hardwareService;
    private final MenuService menuService;
    @GetMapping(value = { "/hardwares"})
    public String hardware(Model model, @RequestParam(required = false) Integer hardwareTypeId) {
        log.info("show hardware : '/hardware' = {}",model);


        List<Hardware> hardwareList = new ArrayList<>();
        if(hardwareTypeId == null){
            model.addAttribute("headerName","Все комплектующие");
            hardwareList = hardwareService.findAll();
        }
        else{
            hardwareList = hardwareService.findAllByHardwareTypeId(hardwareTypeId);
            String hardwareTypeName = "";
            for(Hardware hardware : hardwareList){
                hardwareTypeName = hardware.getHardwareType().getName();
                break;
            }
            model.addAttribute("headerName", hardwareTypeName);
        }
        model.addAttribute("hardwareList", hardwareList);

        model = menuService.getMenuModel(model);
        log.info("show hardware : 'hardware' = {}",model);

        return "hardwares";
    }

}

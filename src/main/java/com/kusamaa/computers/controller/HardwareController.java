package com.kusamaa.computers.controller;

import com.kusamaa.computers.entity.Hardware;
import com.kusamaa.computers.service.HardwareService;
import com.kusamaa.computers.service.MenuService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
@RequiredArgsConstructor
public class HardwareController {

    private final HardwareService hardwareService;
    private final MenuService menuService;

    @GetMapping(value = {"/hardware"})
    public String hardware(Model model, @RequestParam(required = false) Integer hardwareId){
        log.info("show device REQUEST :/hardware&hardwareId={}", hardwareId);

        Hardware hardware = hardwareService.findById(hardwareId);
        String hardwareName = hardware.getName();
        model.addAttribute("headerName",hardwareName);
        model.addAttribute("hardware", hardware);

        model = menuService.getMenuModel(model);
        log.info("show device RESPONSE : model={}",model);
        return "hardware";
    }
}

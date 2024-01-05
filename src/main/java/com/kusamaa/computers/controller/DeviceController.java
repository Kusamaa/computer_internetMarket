package com.kusamaa.computers.controller;

import com.kusamaa.computers.entity.Device;
import com.kusamaa.computers.entity.Hardware;
import com.kusamaa.computers.service.DeviceService;
import com.kusamaa.computers.service.HardwareService;
import com.kusamaa.computers.service.MenuService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
public class DeviceController {
    private final DeviceService deviceService;
    private final MenuService menuService;

    @GetMapping(value = {"/device"})
    public String device(Model model, @RequestParam(required = false) Integer deviceId) {
        log.info("show device REQUEST : /device&deviceId={}",deviceId);

        Device device = deviceService.findById(deviceId);
        String deviceName = device.getName();
        model.addAttribute("headerName",deviceName);
        model.addAttribute("device", device);

        model = menuService.getMenuModel(model);
        log.info("show device RESPONSE : model={}",model);
        return "device";
    }

}

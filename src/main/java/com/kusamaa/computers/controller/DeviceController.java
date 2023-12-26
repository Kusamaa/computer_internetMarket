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
    private final HardwareService hardwareService;
    private final MenuService menuService;

    @GetMapping(value = {"/device"})
    public String device(Model model, @RequestParam(required = false) Integer deviceId, Integer hardwareId) {
        log.info("show device REQUEST : /device&deviceId={},/hardware&hardwareId={}",deviceId, hardwareId);


        if(hardwareId!=null){
            Hardware hardware = hardwareService.findById(hardwareId);
            String hardwareName = hardware.getName();
            model.addAttribute("headerName",hardwareName);
            model.addAttribute("hardware", hardware);
        }
        else{
            List<Device> deviceList = deviceService.findAllByDeviceId(deviceId);
            String deviceName = "";
            for(Device singleDevice: deviceList){
                deviceName = singleDevice.getName();
                break;
            }
            model.addAttribute("headerName",deviceName);

            model.addAttribute("device",deviceList);
        }

        model = menuService.getMenuModel(model);
        log.info("show device RESPONSE : model={}",model);
        return "device";
    }

}

package com.kusamaa.computers.controller;

import com.kusamaa.computers.entity.Device;
import com.kusamaa.computers.service.DeviceService;
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
public class DeviceController {

    private final DeviceService deviceService;
    private final MenuService menuService;

    @GetMapping(value = { "/device"})
    public String laptops(Model model, @RequestParam(required = false) Integer deviceTypeId) {
        log.info("show device REQUEST : /device&deviceTypeId={}",deviceTypeId);
//        log.info("show device : 'device' = {}",model);
//        select * from computers.device where device_type_id = 2

//        Дай нам девайс у которого тип равен deviceTypeId

//        в model кинуть название типа устройства (Компьютер/Ноутбук);

        List<Device> deviceList = new ArrayList<>();

        if(deviceTypeId == null) {
            model.addAttribute("headerName","Все устройства");
            model.addAttribute("deviceTypeName", "Все устройства");
            deviceList = deviceService.findAll();
        }else{
            deviceList = deviceService.findAllByDeviceTypeId(deviceTypeId);
            String deviceTypeName = "";
            for(Device device: deviceList){
                deviceTypeName = device.getDeviceType().getName();
                break;
            }
            model.addAttribute("headerName",deviceTypeName);
            model.addAttribute("deviceTypeName", deviceTypeName);
        }
        model.addAttribute("device", deviceList.get(0).toString());
        model.addAttribute("deviceList", deviceList);

        model = menuService.getMenuModel(model);
        log.info("show device RESPONSE : model={}",model);
        return "devices";
    }
}

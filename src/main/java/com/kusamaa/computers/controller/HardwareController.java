package com.kusamaa.computers.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HardwareController {

    @GetMapping(value = { "/hardware"})
    public String hardware(Model model) {
        log.info("show hardware : '/hardware' = {}",model);
        log.info("show hardware : 'hardware' = {}",model);
        return "hardware";
    }
}

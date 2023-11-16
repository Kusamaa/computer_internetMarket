package com.kusamaa.computers.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class HardwareController {

    @GetMapping(value = { "/hardware"})
    public String hardware(Model model) {
        log.info("show hardware : '/hardware' = {}", model);
        log.info("show hardware : 'hardware' = {}",model);
        return "hardware";
    }
}

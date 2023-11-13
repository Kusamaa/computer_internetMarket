package com.kusamaa.computers.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ComputersController {

    @GetMapping(value = { "/computers"})
    public String computers(Model model) {
        log.info("show computers : '/computers' = {}",model);
        log.info("show computers : 'computers' = {}",model);
        return "computers";
    }
}
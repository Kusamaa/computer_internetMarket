package com.kusamaa.computers.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class LaptopsController {

    @GetMapping(value = { "/laptops"})
    public String laptops(Model model) {
        log.info("show laptops : '/laptops' = {}",model);
        log.info("show laptops : 'laptops' = {}",model);
        return "laptops";
    }
}

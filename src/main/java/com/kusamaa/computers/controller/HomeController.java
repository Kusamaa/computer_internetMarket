package com.kusamaa.computers.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeController {

    @GetMapping(value = {"/" , "/index"})
    public String index(Model model) {
        log.info("show index : '/' or '/index' = {}",model);

        model.addAttribute("whois","программист");
        model.addAttribute("computers","компьютер");

        log.info("show index : '/' or '/index' = {}",model);
        return "index";
    }

    @GetMapping(value = { "/computers"})
    public String computers(Model model) {
        log.info("show computers : '/computers' = {}",model);
        log.info("show computers : 'computers' = {}",model);
        return "computers";
    }

    @GetMapping(value = { "/hardware"})
    public String hardware(Model model) {
        log.info("show hardware : '/hardware' = {}",model);
        log.info("show hardware : 'hardware' = {}",model);
        return "hardware";
    }

    @GetMapping(value = { "/laptops"})
    public String laptops(Model model) {
        log.info("show laptops : '/laptops' = {}",model);
        log.info("show laptops : 'laptops' = {}",model);
        return "laptops";
    }


}
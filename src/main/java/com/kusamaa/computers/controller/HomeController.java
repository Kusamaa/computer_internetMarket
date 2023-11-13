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
}
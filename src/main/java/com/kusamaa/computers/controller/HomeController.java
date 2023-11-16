package com.kusamaa.computers.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
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
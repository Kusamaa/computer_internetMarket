package com.kusamaa.computers.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class HelpController {

    @GetMapping(value = { "/help"})
    public String help(Model model) {
        log.info("show help : '/help' = {}",model);
        log.info("show help : 'help' = {}",model);
        return "help";
    }
}
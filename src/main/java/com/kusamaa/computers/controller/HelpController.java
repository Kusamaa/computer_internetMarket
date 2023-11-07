package com.kusamaa.computers.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HelpController {

    @GetMapping(value = { "/help"})
    public String help(Model model) {
        log.info("show help : '/help' = {}",model);
        log.info("show help : 'help' = {}",model);
        return "help";
    }
}
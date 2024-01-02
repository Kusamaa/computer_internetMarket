package com.kusamaa.computers.controller;

import com.kusamaa.computers.service.MenuService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
public class HelpController {
    private final MenuService menuService;
    @GetMapping(value = { "/help"})
    public String help(Model model) {
        log.info("show help : '/help' = {}",model);
        model.addAttribute("headerName","Справка");

        model = menuService.getMenuModel(model);
        log.info("show help : 'help' = {}",model);
        return "help";
    }
}
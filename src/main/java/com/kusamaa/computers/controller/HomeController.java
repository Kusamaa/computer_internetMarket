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
public class HomeController {
    private final MenuService menuService;
    @GetMapping(value = {"/" , "/index"})
    public String index(Model model) {
        log.info("show index : '/' or '/index' = {}",model);
        model.addAttribute("headerName","Компьютерный магазин");

        model = menuService.getMenuModel(model);
        log.info("show index : '/' or '/index' = {}",model);
        return "index";
    }
}
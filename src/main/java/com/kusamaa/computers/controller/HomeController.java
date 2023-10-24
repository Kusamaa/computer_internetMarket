package com.kusamaa.computers.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class HomeController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());


    @GetMapping(value = {"/" , "/index"})
    public String index(Model model, Principal principal) {
        log.info("show index | redirect: '/' or '/index' -> '/dash-summary' - user : ");
//        Employee currentUser = employeeService.findByUsername(user.getUsername());
//        model.addAttribute("currentUser", currentUser);
//
//        model.addAttribute("header", "Главная страница ёптать");

//        return "index";
        return "index";
    }


    @GetMapping(value = {"/test"})
    public String test() {

        log.info("show -INFO- test endpoint... - user : ");
        log.debug("show -DEBUG- test endpoint... - user : ");
        log.warn("show -WARN- test endpoint... - user : ");
        System.out.println("this = " + "show test endpoint... - user : ");

        return "test.html";
    }



}
package com.example.car.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "欢迎使用树莓派小车控制系统！");
        model.addAttribute("time", new java.util.Date().toString());
        return "index";
    }
}
package com.urbane.contact_manager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home Page handler");
        model.addAttribute("name", "Substring technologies");
        model.addAttribute("Youtube Channel", "learn with tushar");
        return "home";
    }

}

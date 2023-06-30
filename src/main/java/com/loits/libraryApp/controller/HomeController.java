package com.loits.libraryApp.controller;

import com.loits.libraryApp.util.PropertyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private final PropertyUtil propertyUtil;

    @Autowired
    public HomeController(PropertyUtil propertyUtil) {
        this.propertyUtil = propertyUtil;
    }

    @RequestMapping(value = {"/", "/home"})
     public String home(Model model){
        model.addAttribute("welcomeMessage", propertyUtil.getWelcomeMessage());
        model.addAttribute("welcomeDescription", propertyUtil.getWelcomeDescription());
        return "home";
     }
}

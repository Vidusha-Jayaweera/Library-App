package com.loits.libraryApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ErrorController {

    @RequestMapping(value = "/errors", method = {RequestMethod.GET, RequestMethod.POST})
    public String initErrorPage(Model model, HttpServletRequest request){
        Integer errorCode = (Integer) request.getAttribute("javax.servlet.error.status_code");

        String errorMsg;

        switch (errorCode){
            case 404:
                errorMsg = "Page not found";
            case 500:
                errorMsg = "Error occured";
            default:
                errorMsg = "Unknown error occured";
        }

        model.addAttribute("errorCode", errorCode);
        model.addAttribute("errorMsg", errorMsg);

        return "errorPage";
    }
}

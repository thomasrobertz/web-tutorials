package com.laurentiuspilca.webscopes.controllers;

import com.laurentiuspilca.webscopes.services.RandomNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private RandomNumberService numberService;

    @GetMapping(path = "/home")
    public String indexAction(Model model) {
        model.addAttribute("message", numberService.getRandomNumber());
        return "index.html";
    }
}

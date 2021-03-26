package com.laurentiuspilca.webscopes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping(path = "/home")
    public String indexAction(Model model) {
        model.addAttribute("message", "Hello");
        return "index.html";
    }
}

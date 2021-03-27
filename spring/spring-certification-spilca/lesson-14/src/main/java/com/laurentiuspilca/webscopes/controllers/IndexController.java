package com.laurentiuspilca.webscopes.controllers;

import com.laurentiuspilca.webscopes.services.EnglishRandomNameProvider;
import com.laurentiuspilca.webscopes.services.RandomNameProvider;
import com.laurentiuspilca.webscopes.services.RandomNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private RandomNumberService numberService;

    @Autowired
    private EnglishRandomNameProvider randomNameProvider;

    @GetMapping(path = "/number")
    public String numberAction(Model model) {
        model.addAttribute("message", numberService.getRandomNumber());
        return "index.html";
    }

    @GetMapping(path = "/name")
    public String nameAction(Model model) {
        model.addAttribute("message", randomNameProvider.next());
        return "index.html";
    }
}

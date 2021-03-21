package com.spilca.simpleweb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(path = "/test")
    public String test(@RequestHeader String a, @RequestHeader String b, @RequestHeader String c) {
        return String.join(" ", a, b, c);
    }
}

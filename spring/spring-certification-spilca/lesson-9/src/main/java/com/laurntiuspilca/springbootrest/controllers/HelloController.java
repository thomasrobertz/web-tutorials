package com.laurntiuspilca.springbootrest.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(method = RequestMethod.GET, path = "/hello/{myname}")
    public String hello(@PathVariable("myname") String name) {
        return "Hello " + name;
    }
}

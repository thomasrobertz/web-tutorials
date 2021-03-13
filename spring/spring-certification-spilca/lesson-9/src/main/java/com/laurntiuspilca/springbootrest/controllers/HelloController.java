package com.laurntiuspilca.springbootrest.controllers;

import com.laurntiuspilca.springbootrest.dto.Person;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping(path = "/hello/{myname}")
    public String hello(@PathVariable("myname") String name) {
        return "Hello " + name;
    }

    @PostMapping(path = "/goodbye")
    public String goodbye(@RequestBody Person person) {
        return "Goodbye, " + person.getName();
    }
}

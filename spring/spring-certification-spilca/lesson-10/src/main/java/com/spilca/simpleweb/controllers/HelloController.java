package com.spilca.simpleweb.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping(path = "/test")
    public String test(@RequestHeader String a, @RequestHeader String b, @RequestHeader String c, HttpServletResponse response) {
        response.addHeader("cutsomResponseHeader", "HelloWorld");
        return String.join(" ", a, b, c);
    }

    @GetMapping(path = "/all")
    public Map<String, String> all(@RequestHeader Map<String, String> requestParameterMap) {
        return requestParameterMap;
    }
}

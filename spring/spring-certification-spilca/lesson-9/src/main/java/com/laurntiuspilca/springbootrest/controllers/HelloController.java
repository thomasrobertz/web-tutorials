package com.laurntiuspilca.springbootrest.controllers;

import com.laurntiuspilca.springbootrest.dto.Person;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

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

    @GetMapping(path = "/person")
    public Person getPerson() {
        Person p = new Person();
        p.setName("peter");
        return p;
    }

    @GetMapping(path = "/persons")
    public Person[] getPersons() {
        Person p1 = new Person();
        p1.setName("john");
        Person p2 = new Person();
        p2.setName("peter");
        return new Person[] {p1, p2};
    }

    @GetMapping(path = "/personslist")
    public List<Person> getPersonsAsList() {
        Person p1 = new Person();
        p1.setName("john");
        Person p2 = new Person();
        p2.setName("peter");
        return Arrays.asList(p1, p2);
    }
}

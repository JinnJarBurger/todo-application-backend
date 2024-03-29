package com.jinnjar.todo.controller;

import com.jinnjar.todo.model.HelloWorld;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * adnan
 * 3/23/2024
 */
@CrossOrigin("http://localhost:4200/")
@RestController("/")
public class HelloWorldController {

    @GetMapping("{name}")
    public HelloWorld showHelloWorld(@PathVariable String name) {
//        throw new RuntimeException("Damn Son It's An Error!");
        return new HelloWorld("Hello World! " + name);
    }
}

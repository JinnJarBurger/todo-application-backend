package com.jinnjar.todo.controller;

import com.jinnjar.todo.model.BasicAuth;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * adnan
 * 4/7/2024
 */
@CrossOrigin("http://localhost:4200")
@RestController
public class BasicAuthController {

    @GetMapping("/basicAuth")
    public BasicAuth getBasicAuth() {
        return new BasicAuth("Successfully authenticated user");
    }
}

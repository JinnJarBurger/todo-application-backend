package com.jinnjar.todo.controller;

import com.jinnjar.todo.model.Todo;
import com.jinnjar.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * adnan
 * 3/30/2024
 */
@RestController("/users")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/{username}/todos")
    public List<Todo> getAllTodo(@PathVariable String username) {
        return todoService.findAll();
    }
}

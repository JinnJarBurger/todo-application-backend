package com.jinnjar.todo.controller;

import com.jinnjar.todo.model.Todo;
import com.jinnjar.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * adnan
 * 3/30/2024
 */
@CrossOrigin("http://localhost:4200")
@RequestMapping("/users")
@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/{username}/todos")
    public List<Todo> getAllTodo(@PathVariable String username) {
        return todoService.findAll();
    }

    @DeleteMapping("/{username}/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String username,
                                           @PathVariable Long id) {

        Todo todo = todoService.deleteById(id);

        return todo == null ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}

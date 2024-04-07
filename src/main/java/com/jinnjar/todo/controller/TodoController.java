package com.jinnjar.todo.controller;

import com.jinnjar.todo.model.Todo;
import com.jinnjar.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    @GetMapping("/{username}/todos/{id}")
    public Todo getTodo(@PathVariable String username,
                        @PathVariable Long id) {

        return todoService.findById(id);
    }

    @PostMapping("/{username}/todos")
    public ResponseEntity<Void> saveTodo(@PathVariable String username,
                                         @RequestBody Todo todo) {

        Todo createdTodo = todoService.saveOrUpdate(todo);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdTodo.getId())
                .toUri();

        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/{username}/todos/{id}")
    public ResponseEntity<Todo> updateTodo(@PathVariable String username,
                                           @PathVariable Long id,
                                           @RequestBody Todo todo) {

        return new ResponseEntity<>(todoService.saveOrUpdate(todo), HttpStatus.OK);
    }

    @DeleteMapping("/{username}/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String username,
                                           @PathVariable Long id) {

        Todo todo = todoService.deleteById(id);

        return todo == null ? ResponseEntity.notFound().build() : ResponseEntity.noContent().build();
    }
}

package com.jinnjar.todo.service;

import com.jinnjar.todo.model.Todo;
import com.jinnjar.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * adnan
 * 3/31/2024
 */
@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    public List<Todo> findByUsername(String username) {
        return todoRepository.findByUsername(username);
    }

    public Todo findById(Long id) {
        return todoRepository.findById(id).orElse(null);
    }

    public Todo findByUsernameAndId(String username, Long id) {
        return todoRepository.findByUsernameAndId(username, id).orElse(null);
    }

    public Todo saveOrUpdate(Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo deleteById(Long id) {
        Todo todo = findById(id);

        todoRepository.delete(todo);

        return todo;
    }
}

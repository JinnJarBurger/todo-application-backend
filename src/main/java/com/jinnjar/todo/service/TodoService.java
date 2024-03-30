package com.jinnjar.todo.service;

import com.jinnjar.todo.model.Todo;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * adnan
 * 3/31/2024
 */
@Service
public class TodoService {

    private static int idCounter = 0;

    private static final List<Todo> TODOS = List.of(
            new Todo(++idCounter, "JinnJar", "Check the stove", new Date(), false),
            new Todo(++idCounter, "Adnan", "Go to the barber today", new Date(), false),
            new Todo(++idCounter, "Tonu", "Complete the springboot task", new Date(), true)
    );

    public List<Todo> findAll() {
        return TODOS;
    }
}

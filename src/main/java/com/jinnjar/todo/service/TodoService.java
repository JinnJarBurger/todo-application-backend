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

    private static List<Todo> todos = List.of(
            new Todo(++idCounter, "JinnJar", "Check the stove", new Date(), false),
            new Todo(++idCounter, "Adnan", "Go to the barber today", new Date(), false),
            new Todo(++idCounter, "Tonu", "Complete the springboot task", new Date(), true)
    );

    public List<Todo> findAll() {
        return todos;
    }

    public Todo findById(Long id) {
        return todos.stream()
                .filter(todo -> todo.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Todo deleteById(Long id) {
        Todo todo = findById(id);

        if (todo == null) return null;

        todos.remove(todo);

        return todo;
    }
}

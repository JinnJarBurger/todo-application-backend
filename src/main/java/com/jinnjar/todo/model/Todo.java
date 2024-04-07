package com.jinnjar.todo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Objects;

/**
 * adnan
 * 3/30/2024
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Todo {

    private long id;

    private String username;

    private String description;

    private Date targetDate;

    private boolean done;

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Todo todo = (Todo) other;
        return id == todo.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, description, targetDate, done);
    }
}

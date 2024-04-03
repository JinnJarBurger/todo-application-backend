package com.jinnjar.todo.model;

import java.util.Date;
import java.util.Objects;

/**
 * adnan
 * 3/30/2024
 */
public class Todo {

    private long id;

    private String username;

    private String description;

    private Date targetDate;

    private boolean done;

    public Todo(long id, String username, String description, Date targetDate, boolean done) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.done = done;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

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

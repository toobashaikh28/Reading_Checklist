package com.example.todo.model;

public class Todo {

    String title;
    boolean completed;

    public Todo() {
        this.completed = false;
    }
    
    public Todo(String title) {
        this.title = title;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }   

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }   

}

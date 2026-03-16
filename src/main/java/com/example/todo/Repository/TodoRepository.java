package com.example.todo.Repository;

import com.example.todo.model.Todo;
import java.util.*;
import org.springframework.stereotype.Repository;

@Repository
public class TodoRepository {

    private final List<Todo> todos = new ArrayList<>();
    
    public TodoRepository() {
        todos.add(new Todo("The Atomic Habits"));
        todos.add(new Todo("The Power of Now"));
        todos.add(new Todo("Al-chemist"));
        todos.add(new Todo("The 7 Habits of Highly Effective People"));
    }

    public void addTodo(String title) {
        todos.add(new Todo(title));
    }

    public void toggleTodo(int index) {
        if (index >= 0 && index < todos.size()){
            Todo t = todos.get(index);
            t.setCompleted(!t.isCompleted());
        }
    }

    public List<Todo> getAllTodos() {
        return todos;
    }
}

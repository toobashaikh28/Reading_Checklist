package com.example.todo.service;

import org.springframework.stereotype.Service;
import com.example.todo.Repository.TodoRepository;
import com.example.todo.model.Todo;
import java.util.List;


@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAllTodos() {
        return todoRepository.getAllTodos();
    }

    public void addTodo(String title) {
        todoRepository.addTodo(title);
    }

    public void toggleTodo(int index) {
        todoRepository.toggleTodo(index);
    }

    public void deleteTodo(int index) {
        todoRepository.deleteTodo(index);
    }

    public void editTodo(int index, String title) {
        todoRepository.editTodo(index, title);
    }
    
}

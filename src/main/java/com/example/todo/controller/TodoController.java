package com.example.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import com.example.todo.service.TodoService;

@Controller
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/")
    public String books(Model model){
        model.addAttribute("todos", todoService.getAllTodos());
        return "todo";
    }

    @PostMapping("/add")
    public String addTodo(@RequestParam String title){
        todoService.addTodo(title);
        return "redirect:/";
    }

    @PostMapping("/toggle/{index}")
    public String toggleTodo(@PathVariable int index){
        todoService.toggleTodo(index);
        return "redirect:/";
    }
    
}
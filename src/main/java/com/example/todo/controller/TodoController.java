package com.example.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import com.example.todo.service.TodoService;

@Controller
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/")
    public String books(Model model) {
        model.addAttribute("todos", todoService.getAllTodos());
        return "todo";
    }

    @PostMapping("/add")
    public String addTodo(@RequestParam String title) {
        todoService.addTodo(title);
        return "redirect:/";
    }

    @PostMapping("/toggle/{index}")
    public String toggleTodo(@PathVariable int index) {
        todoService.toggleTodo(index);
        return "redirect:/";
    }

    @PostMapping("/delete/{index}")
    public String deleteTodo(@PathVariable int index) {
        todoService.deleteTodo(index);
        return "redirect:/";
    }

    @PostMapping("/update/{index}")
    public String updateTodo(@PathVariable int index, @RequestParam String title) {
        todoService.editTodo(index, title);
        return "redirect:/";
    }

}
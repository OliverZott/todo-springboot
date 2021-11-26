package com.velo.todoapi.controller;

import com.velo.todoapi.entity.Todo;
import com.velo.todoapi.repository.TodoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TodoController {

    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/todos")
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    @GetMapping("/todos/{id}")
    public Optional<Todo> getTodo(@PathVariable("id") Long id) {
        var todo = todoRepository.findById(id);
        return todo;
    }

    // RequestBody annotation for Json-mapping
    @PostMapping("/todos")
    public Todo postTodo(@RequestBody Todo todo) {
        return todoRepository.save(todo);
    }


}

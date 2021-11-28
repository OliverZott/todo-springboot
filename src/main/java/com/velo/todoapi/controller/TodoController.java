package com.velo.todoapi.controller;

import com.velo.todoapi.entity.Todo;
import com.velo.todoapi.repository.TodoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:3000/")
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

//    @PutMapping("/todos/{id}")
//    public Optional<Todo> updateTodo(@PathVariable("id") Long id, @RequestBody Todo updatedTodo) {
//        return this.todoRepository.findById(id)
//                .map(todo -> this.todoRepository.save(updatedTodo));
//    }

    @PutMapping("/todos/{id}")
    public Optional<Todo> updateTodo(@PathVariable("id") Long id, @RequestBody Todo updatedTodo) {
        return this.todoRepository.findById(id)
                .map(todo -> {
                    todo.setTitle(updatedTodo.getTitle());
                    todo.setCompleted(updatedTodo.getCompleted());
                    return todoRepository.save(todo);
                });
    }

    @DeleteMapping("/todos/{id}")
    public void deleteTodo(@PathVariable("id") Long id) {
        todoRepository.deleteById(id);
    }

}

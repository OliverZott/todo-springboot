package com.velo.todoapi.repository;

import com.velo.todoapi.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:3000/")
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
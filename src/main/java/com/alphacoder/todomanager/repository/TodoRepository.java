package com.alphacoder.todomanager.repository;

import com.alphacoder.todomanager.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
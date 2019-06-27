package com.example.todo.controller;

import com.example.todo.entities.Todo;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Collection;

@EntityScan("com.example.todo.entities")
@RepositoryRestResource
public interface TodoRepository extends JpaRepository <Todo, Long>{

  @RestResource(path="by-name")
  Collection<Todo> findByName(@Param("pn") String pn);
}

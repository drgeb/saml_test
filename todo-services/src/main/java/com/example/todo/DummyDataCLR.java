package com.example.todo;

import com.example.todo.controller.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import com.example.todo.entities.Todo;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class DummyDataCLR implements CommandLineRunner {

  @Autowired
  private TodoRepository todoRepository;

  @Override
  public void run(String ...strings) {
    Stream.of("Do HomeWork","Learn more Spring","Learn Angular","What about Svelt").
      forEach(p-> this.todoRepository.save(new Todo(p)));
  }
}

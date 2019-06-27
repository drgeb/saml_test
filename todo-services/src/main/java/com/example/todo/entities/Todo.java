package com.example.todo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Todo {

  @Id
  @GeneratedValue
  private Long id;
  private String name;

  public Todo(String p) {
    this.name=p;
  }
}

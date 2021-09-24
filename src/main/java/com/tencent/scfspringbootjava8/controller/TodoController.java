package com.tencent.scfspringbootjava8.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private List<String> todos = new ArrayList<>();

    public TodoController() {
        todos.add("first todo");
    }

    @GetMapping
    public String get() {
        return todos.toString();
    }

    @PostMapping
    public String add(@RequestBody String todo) {
        todos.add(todo);
        return todos.toString();
    }
}
